package singleton.lanhanshi;

/**
 * @author LX
 * @date 2018-11-5 19:06
 */

/**
 * 单例模式（懒汉式）//只有在你需要的时候手动创建
 * 1.构造器私有化
 * 2.用静态变量去保存这个唯一实例
 * 3.提供一个静态方法获取这个实例对象
 * （当前实现存在线程安全问题，只适用于单线程）
 */

public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getSingleton4() throws InterruptedException {
        if (instance == null) {
            Thread.sleep(1000);

            instance = new Singleton4();
        }
        return instance;
    }


}

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
 * （当前实现已使用synchronized同步，不再存在线程安全问题）
 */

public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }


}

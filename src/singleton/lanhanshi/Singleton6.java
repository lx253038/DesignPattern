package singleton.lanhanshi;

/**
 * @author LX
 * @date 2018-11-5 19:33
 */

/**
 * 单例模式（懒汉式）//只有在你需要的时候手动创建
 * 1.构造器私有化
 * 2.提供一个静态方法获取这个实例对象
 * 使用静态内部类的方式实例化对象，不存在线程安全问题
 * （在内部类被加载和初始化时才会创建INSTANCE实例对象
 * 静态内部类不会自动随着外部类的加载和初始化而初始化，它是要单独去加载和初始化的）
 */

public class Singleton6 {

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        return Inner.INSTANCE;
    }

    private static class Inner {


        private static final Singleton6 INSTANCE = new Singleton6();
    }
}

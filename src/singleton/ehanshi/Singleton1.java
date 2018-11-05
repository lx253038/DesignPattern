package singleton.ehanshi;

/**
 * @author LX
 * @date 2018-11-5 18:18
 */

/**
 * 单例模式（饿汉式）//在类实例化时直接创建实例对象，不管你是否需要
 * 1.构造器私有化
 * 2.自行创建，并且用静态变量报存
 * 3.向外提供这个实例
 * 4.强调单例，使用final关键字修饰
 */

public class Singleton1 {
    public static final Singleton1 INTENCE = new Singleton1();

    private Singleton1() {
    }

}

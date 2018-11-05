package singleton.ehanshi;

/**
 * @author LX
 * @date 2018-11-5 18:18
 */

import java.io.IOException;
import java.util.Properties;

/**
 * 单例模式（饿汉式）//在类实例化时直接创建实例对象，不管你是否需要
 * 1.构造器私有化
 * 2.自行创建，并且用静态变量报存
 * 3.向外提供这个实例
 * 4.强调单例，使用final关键字修饰
 * <p>
 * 静态代码块饿汉式（适用于复杂的实例化，例如：从配置文件中获取属性）
 */

public class Singleton3 {
    public static final Singleton3 INTENCE;

    static {
        Properties pro = new Properties();
        try {
            pro.load(Singleton3.class.getClassLoader().getResourceAsStream("singleton.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        INTENCE = new Singleton3(pro.getProperty("name"));
    }

    private String name;

    private Singleton3(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "name='" + name + '\'' +
                '}';
    }
}

package singleton.ehanshi;

/**
 * @author LX
 * @date 2018-11-5 18:18
 */

import java.io.IOException;
import java.util.Properties;

/**
 * ����ģʽ������ʽ��//����ʵ����ʱֱ�Ӵ���ʵ�����󣬲������Ƿ���Ҫ
 * 1.������˽�л�
 * 2.���д����������þ�̬��������
 * 3.�����ṩ���ʵ��
 * 4.ǿ��������ʹ��final�ؼ�������
 * <p>
 * ��̬��������ʽ�������ڸ��ӵ�ʵ���������磺�������ļ��л�ȡ���ԣ�
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

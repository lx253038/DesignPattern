package singleton.ehanshi;

/**
 * @author LX
 * @date 2018-11-5 18:18
 */

/**
 * ����ģʽ������ʽ��//����ʵ����ʱֱ�Ӵ���ʵ�����󣬲������Ƿ���Ҫ
 * 1.������˽�л�
 * 2.���д����������þ�̬��������
 * 3.�����ṩ���ʵ��
 * 4.ǿ��������ʹ��final�ؼ�������
 */

public class Singleton1 {
    public static final Singleton1 INTENCE = new Singleton1();

    private Singleton1() {
    }

}

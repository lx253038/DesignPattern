package singleton.lanhanshi;

/**
 * @author LX
 * @date 2018-11-5 19:33
 */

/**
 * ����ģʽ������ʽ��//ֻ��������Ҫ��ʱ���ֶ�����
 * 1.������˽�л�
 * 2.�ṩһ����̬������ȡ���ʵ������
 * ʹ�þ�̬�ڲ���ķ�ʽʵ�������󣬲������̰߳�ȫ����
 * �����ڲ��౻���غͳ�ʼ��ʱ�Żᴴ��INSTANCEʵ������
 * ��̬�ڲ��಻���Զ������ⲿ��ļ��غͳ�ʼ������ʼ��������Ҫ����ȥ���غͳ�ʼ���ģ�
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

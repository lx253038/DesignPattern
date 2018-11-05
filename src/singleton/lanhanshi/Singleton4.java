package singleton.lanhanshi;

/**
 * @author LX
 * @date 2018-11-5 19:06
 */

/**
 * ����ģʽ������ʽ��//ֻ��������Ҫ��ʱ���ֶ�����
 * 1.������˽�л�
 * 2.�þ�̬����ȥ�������Ψһʵ��
 * 3.�ṩһ����̬������ȡ���ʵ������
 * ����ǰʵ�ִ����̰߳�ȫ���⣬ֻ�����ڵ��̣߳�
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

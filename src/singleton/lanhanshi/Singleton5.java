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
 * ����ǰʵ����ʹ��synchronizedͬ�������ٴ����̰߳�ȫ���⣩
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

package adapter;

/**
 * @Author LX
 * @Date 2020/5/31 16:21
 * @Description
 */
public class Phone {

    public void charging(OutVc5 outVc5) {
        if (outVc5.output5v() == 5) {
            System.out.println("��ѹ5V,���Գ��");
        } else {
            System.out.println("��ѹ����5V,���Գ��");
        }
    }


}

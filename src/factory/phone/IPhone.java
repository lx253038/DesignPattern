package factory.phone;

/**
 * @Author LX
 * @Date 2020/5/31 14:34
 * @Description
 */
public class IPhone implements Phone {

    public IPhone() {
        System.out.println("����ƻ���ֻ�");
    }

    @Override
    public void productInfo() {
        System.out.println("����ƻ���ֻ�");

    }
}

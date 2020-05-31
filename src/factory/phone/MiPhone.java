package factory.phone;

/**
 * @Author LX
 * @Date 2020/5/31 14:33
 * @Description
 */
public class MiPhone implements Phone {
    public MiPhone() {
        System.out.println("===========生成小米手机======");
    }

    @Override
    public void productInfo() {
        System.out.println("===========我是小米手机======");

    }
}

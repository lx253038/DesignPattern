package factory.pc;

/**
 * @Author LX
 * @Date 2020/5/31 14:34
 * @Description
 */
public class ApplePC implements PC {

    public ApplePC() {
        System.out.println("����ƻ������");
    }

    @Override
    public void productInfo() {
        System.out.println("����ƻ������");

    }
}

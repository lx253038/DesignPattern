package factory.pc;

/**
 * @Author LX
 * @Date 2020/5/31 14:34
 * @Description
 */
public class ApplePC implements PC {

    public ApplePC() {
        System.out.println("生产苹果电脑");
    }

    @Override
    public void productInfo() {
        System.out.println("我是苹果电脑");

    }
}

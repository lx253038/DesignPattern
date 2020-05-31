package factory.pc;

/**
 * @Author LX
 * @Date 2020/5/31 14:33
 * @Description
 */
public class MiPC implements PC {
    public MiPC() {
        System.out.println("===========生成小米电脑======");
    }

    @Override
    public void productInfo() {
        System.out.println("===========我是小米电脑======");

    }
}

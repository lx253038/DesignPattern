package factory.abstractfactory;

import factory.pc.MiPC;
import factory.pc.PC;
import factory.phone.MiPhone;
import factory.phone.Phone;

/**
 * @Author LX
 * @Date 2020/5/31 14:44
 * @Description
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public PC makePC() {
        return new MiPC();
    }
}

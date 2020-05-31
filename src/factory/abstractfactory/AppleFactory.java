package factory.abstractfactory;

import factory.pc.ApplePC;
import factory.pc.PC;
import factory.phone.IPhone;
import factory.phone.Phone;

/**
 * @Author LX
 * @Date 2020/5/31 14:45
 * @Description
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public PC makePC() {
        return new ApplePC();
    }
}

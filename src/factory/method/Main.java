package factory.method;

import factory.phone.IPhone;
import factory.phone.Phone;

/**
 * @Author LX
 * @Date 2020/5/31 14:45
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        Phone miPhone = miFactory.makePhone();
        IPhone iPhone = (IPhone) appleFactory.makePhone();
        miPhone.productInfo();
        iPhone.productInfo();
    }
}

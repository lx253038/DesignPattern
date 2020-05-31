package factory.simple;

import factory.phone.IPhone;
import factory.phone.MiPhone;
import factory.phone.Phone;

/**
 * @Author LX
 * @Date 2020/5/31 14:32
 * @Description 简单工厂方法（以生产手机为例）
 */
public class SimpleFactory {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Phone miPhone = simpleFactory.make("MiPhone");
        IPhone iPhone = (IPhone) simpleFactory.make("IPhone");
        miPhone.productInfo();
        iPhone.productInfo();
    }

    public Phone make(String type) {
        if ("MiPhone".equals(type)) {
            return new MiPhone();
        } else if ("IPhone".equals(type)) {
            return new IPhone();
        }
        return null;
    }
}

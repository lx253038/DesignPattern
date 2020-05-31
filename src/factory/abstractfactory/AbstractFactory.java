package factory.abstractfactory;

import factory.pc.PC;
import factory.phone.Phone;

/**
 * @Author LX
 * @Date 2020/5/31 14:42
 * @Description 抽象工厂模式
 */
public interface AbstractFactory {

    Phone makePhone();

    PC makePC();

}

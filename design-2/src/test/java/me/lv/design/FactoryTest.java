package me.lv.design;

import me.lv.design.factory.FactoryA;
import me.lv.design.factory.FactoryB;
import org.junit.Test;

/**
 * @author plume
 */

public class FactoryTest {

    @Test
    public void testFactory() {
        AbstractFactory mFactoryA = new FactoryA();
        AbstractFactory mFactoryB = new FactoryB();

        //A厂当地客户需要容器产品A
        mFactoryA.manufactureContainer().show();
        //A厂当地客户需要模具产品A
        mFactoryA.manufactureMould().show();

        //B厂当地客户需要容器产品B
        mFactoryB.manufactureContainer().show();
        //B厂当地客户需要模具产品B
        mFactoryB.manufactureMould().show();
    }
}

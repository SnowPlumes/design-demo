package me.lv.design.factory;

import me.lv.design.AbstractFactory;
import me.lv.design.AbstractProduct;
import me.lv.design.product.ContainerProductA;
import me.lv.design.product.MouldProductA;

/**
 * @author plume
 */
public class FactoryA extends AbstractFactory {

    @Override
    public AbstractProduct manufactureContainer() {
        return new ContainerProductA();
    }

    @Override
    public AbstractProduct manufactureMould() {
        return new MouldProductA();
    }
}

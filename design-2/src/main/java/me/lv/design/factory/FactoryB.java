package me.lv.design.factory;

import me.lv.design.AbstractFactory;
import me.lv.design.AbstractProduct;
import me.lv.design.product.ContainerProductB;
import me.lv.design.product.MouldProductB;

/**
 * @author plume
 * @date 2020/12/29 22:56
 */
public class FactoryB extends AbstractFactory {
    @Override
    public AbstractProduct manufactureContainer() {
        return new ContainerProductB();
    }

    @Override
    public AbstractProduct manufactureMould() {
        return new MouldProductB();
    }
}

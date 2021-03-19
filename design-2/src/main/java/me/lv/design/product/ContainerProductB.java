package me.lv.design.product;

import lombok.extern.slf4j.Slf4j;

/**
 * @author plume
 */
@Slf4j
public class ContainerProductB extends ContainerProduct{
    @Override
    public void show() {
        log.info("容器产品 B...");
    }
}

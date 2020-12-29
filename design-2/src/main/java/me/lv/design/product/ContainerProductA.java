package me.lv.design.product;

import lombok.extern.slf4j.Slf4j;

/**
 * @author plume
 */
@Slf4j
public class ContainerProductA extends ContainerProduct{
    @Override
    public void show() {
        log.info("ContainerProductA...");
    }
}

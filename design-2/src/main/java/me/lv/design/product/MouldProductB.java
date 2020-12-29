package me.lv.design.product;

import lombok.extern.slf4j.Slf4j;

/**
 * @author plume
 */
@Slf4j
public class MouldProductB extends MouldProduct{

    @Override
    public void show() {
        log.info("MouldProductB...");
    }
}

package me.lv.design;

import org.junit.Test;

/**
 * @author plume
 */
public class AdapterTest {

    @Test
    public void test() {
        Motor motor = new ElectricAdapter();
        motor.drive();
    }

}

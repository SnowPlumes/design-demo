package me.lv.design;

import org.junit.Test;

/**
 * @author plume
 */
public class FlyweightTest {

    @Test
    public void test() {
        Student student = Student.create(1, "test");
        Student student1 = Student.create(1, "test");
        System.out.println(student == student1);
    }
}

package me.lv.design;

import org.junit.Test;

/**
 * @author plume
 */
public class FlyweightTest {

    @Test
    public void test() {
        /*Integer n1 = Integer.valueOf(100);
        Integer n2 = Integer.valueOf(100);
        System.out.println(n1 == n2);
        */

        Student student = Student.create(1, "test");
        Student student1 = Student.create(1, "test");
        System.out.println(student == student1);
    }
}

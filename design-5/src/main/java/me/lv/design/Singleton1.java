package me.lv.design;

/**
 * @author plume
 */
public class Singleton1 {
    private static Singleton1 INSTANCE = null;

    public static Singleton1 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton1();
        }
        return INSTANCE;
    }

    private Singleton1() {
    }
}

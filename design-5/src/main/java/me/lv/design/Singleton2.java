package me.lv.design;

/**
 * @author plume
 */
public class Singleton2 {

    private static Singleton2 INSTANCE = null;

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }

    private Singleton2() {
    }
}

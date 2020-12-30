package me.lv.design;

/**
 * @author plume
 */
public enum Singleton3 {
    /**
     *
     */
    INSTANCE;

    private String name = "world";

    public String getName() {
        return this.name;
    }
}

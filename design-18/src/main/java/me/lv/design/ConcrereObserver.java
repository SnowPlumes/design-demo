package me.lv.design;

/**
 * @author plume
 * 具体观察者
 */
public class ConcrereObserver implements Observer {

    private String name;

    public ConcrereObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}

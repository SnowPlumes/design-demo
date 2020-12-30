package me.lv.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @author plume
 */
public class ConcreteSubject implements Subject{

    private List<Observer> list = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        list.forEach(i -> {
            i.update(message);
        });
    }
}

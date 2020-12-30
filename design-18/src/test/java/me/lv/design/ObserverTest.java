package me.lv.design;

import org.junit.Test;

/**
 * @author plume
 */
public class ObserverTest {

    @Test
    public void test() {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        // 观察者
        ConcrereObserver observer1 = new ConcrereObserver("张三");
        ConcrereObserver observer2 = new ConcrereObserver("李四");
        ConcrereObserver observer3 = new ConcrereObserver("王五");

        // 订阅
        concreteSubject.attach(observer1);
        concreteSubject.attach(observer2);
        concreteSubject.attach(observer3);

        concreteSubject.notify("消息");
    }
}

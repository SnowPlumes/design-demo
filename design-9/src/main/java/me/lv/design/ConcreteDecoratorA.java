package me.lv.design;

/**
 * @author plume
 * 具体装饰器类
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void operationFirst() {
        System.out.println("operationFirst say");
    }

    private void operationLast() {
        System.out.println("operationLast say");
    }

    @Override
    public void operation() {
        operationFirst();
        super.operation();
        operationLast();
    }

    public void anotherOperation() {
        System.out.println("another operation");
    }
}

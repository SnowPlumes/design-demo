package me.lv.design;

/**
 * @author plume
 * 抽象装饰器类
 */
public abstract class Decorator extends Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation(){
        component.operation();
    }
}

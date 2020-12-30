package me.lv.design;

/**
 * @author plume
 */
public class ConcreteComponent extends Component{

    @Override
    public void operation() {
        System.out.println("ConcreteComponent say");
    }
}

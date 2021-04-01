package iceCream;

/**
 * @author QiuQian
 */
public class TestDecorator {
    public static void main(String[] args) {
        new IceCreamDecorator(new HoneyDecorator()).makeIceCream();
        new IceCreamDecorator(new NuttyDecorator()).makeIceCream();
    }
}

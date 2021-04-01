package iceCream;

/**
 * @author QiuQian
 */
public class HoneyDecorator extends IceCreamDecorator{
    private IceCreamDecorator iceCreamDecorator;
    public HoneyDecorator(IceCreamDecorator iceCreamDecorator) {
        super(iceCreamDecorator);
    }

    public HoneyDecorator() {
        super();
    }

    public String addHoney() {
        System.out.println("addHoney");
        return null;
    }

    @Override
    public String makeIceCream() {
        addHoney();
        System.out.println("making honey ice cream");
        return null;
    }
}

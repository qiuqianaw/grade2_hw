package iceCream;

/**
 * @author QiuQian
 */
public class NuttyDecorator extends IceCreamDecorator{
    private IceCream iceCream;

    public NuttyDecorator(IceCream iceCream) {
        super(iceCream);
        this.iceCream = iceCream;
    }

    public NuttyDecorator() {
        super();
    }


    public String addNuts() {
        System.out.println("addNuts...");
        return null;
    }

    @Override
    public String makeIceCream() {
        addNuts();
        System.out.println("making nutty ice cream");
        return null;
    }
}

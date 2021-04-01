package iceCream;

/**
 * @author QiuQian
 */
public class IceCreamDecorator implements IceCream{
    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public IceCreamDecorator() {

    }

    @Override
    public String makeIceCream() {
        iceCream.makeIceCream();
        return null;
    }
}

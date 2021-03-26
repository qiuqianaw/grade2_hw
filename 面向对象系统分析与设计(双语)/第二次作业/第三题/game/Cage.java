package game;

/**
 * @author QiuQian
 */
public class Cage extends Character {

    public Cage(String name) {
        super(name);
    }

    @Override
    public void take(int quantity, Treasure treasure) {
        System.out.println(name + "拿走了 " + quantity + " 个treasure");
        treasure.setQuantity(treasure.getQuantity() - quantity);
        treasure.notifyEudemon(this);
    }
}

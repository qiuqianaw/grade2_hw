package room;

/**
 * @author QiuQian
 */
public class Test {
    public static void main(String[] args) {
        Room roomDecorator = new BlueDecorator(new SimpleRoom());
        System.out.println(roomDecorator);

        Room roomDecorator2 = new RedDecorator(new SimpleRoom());
        System.out.println(roomDecorator2);
    }
}

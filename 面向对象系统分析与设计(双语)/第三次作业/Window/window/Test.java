package window;

/**
 * @author QiuQian
 */
public class Test {
    public static void main(String[] args) {
        Window windowDecorator = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        System.out.println(windowDecorator.getDescription());

    }
}

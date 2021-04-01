package window;

/**
 * @author QiuQian
 */
public class VerticalScrollBarDecorator extends WindowDecorator  {

    public VerticalScrollBarDecorator(Window window) {
        super(window);
    }

    @Override
    public String getDescription() {
        return window.getDescription() +  ", including vertical scrollbars";
    }

    @Override
    public void draw() {
        window.draw();
        drawVerticalScrollBar();
    }

    public void drawVerticalScrollBar() {
        System.out.println("drawVerticalScrollBar");
    }
}

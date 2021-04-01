package window;

/**
 * @author QiuQian
 */
public class HorizontalScrollBarDecorator extends WindowDecorator{
    public HorizontalScrollBarDecorator(Window window) {
        super(window);
    }

    @Override
    public String getDescription() {
        return window.getDescription() + ", including horizontal scrollbars";
    }

    @Override
    public void draw() {
        window.draw();
        drawHorizontalScrollBar();

    }

    public void drawHorizontalScrollBar() {
        System.out.println("drawHorizontalScrollBar");
    }

}

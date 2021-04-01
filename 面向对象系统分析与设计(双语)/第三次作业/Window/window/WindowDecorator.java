package window;

/**
 * @author QiuQian
 */
public abstract class WindowDecorator implements Window{
    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void draw() {
        window.draw();
    }
}

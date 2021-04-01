package room;

/**
 * @author QiuQian
 */
public class BlueDecorator extends RoomDecorator{
    public BlueDecorator(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", with blue decorator";
    }

    @Override
    public void room() {
        room.room();
        getColor();
    }

    public void getColor() {
        System.out.println("blue");
    }
}

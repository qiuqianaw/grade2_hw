package room;

/**
 * @author QiuQian
 */
public class RedDecorator extends RoomDecorator{
    public RedDecorator(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", with red decorator";
    }

    @Override
    public void room() {
        room.room();
        getColor();
    }

    public void getColor() {
        System.out.println("red");
    }
}

package room;

/**
 * @author QiuQian
 */
public abstract class RoomDecorator implements Room{
    protected Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    @Override
    public void room() {
        room.room();
    }

}

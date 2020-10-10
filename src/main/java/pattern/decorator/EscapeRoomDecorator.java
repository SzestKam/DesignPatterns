package pattern.decorator;

class EscapeRoomDecorator extends BasicRoomDecorator {
    public EscapeRoomDecorator(Room room) {
        super(room);
    }

    @Override
    public void meeting() {
        super.meeting();
        System.out.println("Room excluded doors and windows so you have to find escape.");
    }
}

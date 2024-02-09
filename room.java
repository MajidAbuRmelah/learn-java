class Room {
    public int size;
    public String location;
    public int windows;

    public Room() {
        size = 10;
        location = "Abu Sinan";
        windows = 2;
    }

    @Override
    public String toString() {
        return "size: " + size + ", location: " + location + ", windows: " + windows;
    }
}

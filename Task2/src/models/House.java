package models;

public class House extends Facility{
    private String roomStandard;
    private int floor;

    public House() {
    }

    public House(String name, double area, int rent, int maximumPeople, String rentalType, String roomStandard, int floor) {
        super(name, area, rent, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }
}

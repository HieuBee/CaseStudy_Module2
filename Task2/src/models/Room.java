package models;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String name, double area, int rent, int maximumPeople, String rentalType, String freeService) {
        super(name, area, rent, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}

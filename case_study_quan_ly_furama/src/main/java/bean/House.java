package bean;

public class House extends Facility{
    private String roomType;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomType, int numberOfFloors) {
        this.roomType = roomType;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceName, float usableArea, float rentalCost, int maximumNumberPeople, String rentalType, String roomType, int numberOfFloors) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentalType);
        this.roomType = roomType;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomType='" + roomType + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}

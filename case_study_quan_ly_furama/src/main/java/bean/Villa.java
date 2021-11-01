package bean;

public class Villa extends Facility {
    private String roomType;
    private float swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomType, float swimmingPoolArea, int numberOfFloors) {
        this.roomType = roomType;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, float usableArea, float rentalCost, int maximumNumberPeople, String rentalType, String roomType, float swimmingPoolArea, int numberOfFloors) {
        super(serviceName, usableArea, rentalCost, maximumNumberPeople, rentalType);
        this.roomType = roomType;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public float getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(float swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}

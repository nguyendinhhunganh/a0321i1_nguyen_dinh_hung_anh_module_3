package bean;

public abstract class Facility {
    private String serviceName;
    private float usableArea;
    private float rentalCost;
    private int maximumNumberPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, float usableArea, float rentalCost, int maximumNumberPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maximumNumberPeople = maximumNumberPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(float usableArea) {
        this.usableArea = usableArea;
    }

    public float getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(float rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaximumNumberPeople() {
        return maximumNumberPeople;
    }

    public void setMaximumNumberPeople(int maximumNumberPeople) {
        this.maximumNumberPeople = maximumNumberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "serviceName='" + serviceName +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maximumNumberPeople=" + maximumNumberPeople +
                ", rentalType='" + rentalType;
    }
}

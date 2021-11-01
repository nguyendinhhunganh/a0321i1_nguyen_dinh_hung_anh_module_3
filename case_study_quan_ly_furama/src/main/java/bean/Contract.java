package bean;

public class Contract {
    private Booking booking;
    private int contractCode;
    private float deposit;
    private int totalMoney;

    public Contract() {
    }

    public Contract(Booking booking, int contractCode, float deposit, int totalMoney) {
        this.booking = booking;
        this.contractCode = contractCode;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getContractCode() {
        return contractCode;
    }

    public void setContractCode(int contractCode) {
        this.contractCode = contractCode;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "booking=" + booking +
                ", contractCode=" + contractCode +
                ", deposit=" + deposit +
                ", totalMoney=" + totalMoney +
                '}';
    }
}

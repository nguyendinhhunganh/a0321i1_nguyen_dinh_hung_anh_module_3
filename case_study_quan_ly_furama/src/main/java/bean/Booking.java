package bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Booking implements Comparator<Booking> {
    private int bookingCode;
    private String firstDay;
    private String lastDay;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(int bookingCode, String firstDay, String lastDay, Customer customer, Facility facility) {
        this.bookingCode = bookingCode;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.customer = customer;
        this.facility = facility;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getLastDay() {
        return lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", firstDay='" + firstDay + '\'' +
                ", lastDay='" + lastDay + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate1 = LocalDate.parse(o1.getFirstDay(), dateTimeFormatter);
        LocalDate startDate2 = LocalDate.parse(o2.getFirstDay(), dateTimeFormatter);
        LocalDate endDate1 = LocalDate.parse(o1.getLastDay(), dateTimeFormatter);
        LocalDate endDate2 = LocalDate.parse(o2.getLastDay(), dateTimeFormatter);
        if (startDate1.compareTo(startDate2) > 0) {
            return 1;
        } else if (startDate1.compareTo(startDate2) < 0) {
            return -1;
        } else {
            if (endDate1.compareTo(endDate2) > 0) {
                return 1;
            } else if (endDate1.compareTo(endDate2) < 0) {
                return -1;
            }
            return 0;
        }
}}

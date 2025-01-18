package pojos.vwo;

public class Booking {
    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositepaid;
    private String additionalneeds;
    private BookingDates bookingDates;

    public BookingDates getBookingDates() {
        return bookingDates;
    }

    public void setBookingdates(BookingDates bookingDates) {
        this.bookingDates = bookingDates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public Boolean getDepositepaid() {
        return depositepaid;
    }

    public void setDepositpaid(Boolean depositepaid) {
        this.depositepaid = depositepaid;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }




}

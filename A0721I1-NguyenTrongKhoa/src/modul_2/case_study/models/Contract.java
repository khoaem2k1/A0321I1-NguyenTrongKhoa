package case_study.models;

public class Contract {
    private String idContract;
    private Booking booking;
    private String prepayment;
    private String pay;
    private Customer customer;

    public Contract() {
    }

    public Contract(String idContract, Booking booking, String prepayment, String pay, Customer customer) {
        this.idContract = idContract;
        this.booking = booking;
        this.prepayment = prepayment;
        this.pay = pay;
        this.customer = customer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getPrepayment() {
        return prepayment;
    }

    public void setPrepayment(String prepayment) {
        this.prepayment = prepayment;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", booking=" + booking +
                ", prepayment='" + prepayment + '\'' +
                ", pay='" + pay + '\'' +
                ", customer=" + customer +
                '}';
    }
}

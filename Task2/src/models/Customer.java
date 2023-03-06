package models;

public class Customer extends Person{
    private String typeGuest;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, int date, String sex, int idCard, int numberPhone, String email, String typeGuest, String address) {
        super(id, name, date, sex, idCard, numberPhone, email);
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeGuest='" + typeGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

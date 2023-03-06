package models;

public class Employee extends Person{
    private String level;
    private String location;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int date, String sex, int idCard, int numberPhone, String email, String level, String location, int salary) {
        super(id, name, date, sex, idCard, numberPhone, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}

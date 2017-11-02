/**
 * Created by Damian on 02.11.2017.
 */
public class Employee {

    private String name;
    private String lastname;
    private double monthSalary;
    private int age;

    public Employee(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Employee(String name, String lastname, double monthSalary, int age) {
        this.name = name;
        this.lastname = lastname;
        this.monthSalary = monthSalary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", monthSalary=" + monthSalary +
                ", age=" + age +
                '}';
    }
}

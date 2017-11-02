import java.util.ArrayList;

/**
 * Created by Damian on 02.11.2017.
 */
public class Company {

    private String name;
    private String headquarters;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name, String headquarters) {
        this.name = name;
        this.headquarters = headquarters;
    }

    public String getName() {
        return name;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public int numberOfEmployees(){
        return employees.size();
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", headquarters='" + headquarters + '\'' +
                ", employees=" + employees +
                '}';
    }
}

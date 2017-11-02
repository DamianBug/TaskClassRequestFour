import java.util.ArrayList;

/**
 * Created by Damian on 02.11.2017.
 */
public class Main {

    public static void main(String[] args){

        Company firstCompany = new Company("First Company", "Nowe Miasto");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jan", "Kowalski", 2870,45));
        employees.add(new Employee("Kamil", "Nowak", 3200.80, 30));
        employees.add(new Employee("Zbigniew", "Kowalski", 3150, 29));
        firstCompany.setEmployees(employees);

        System.out.println(firstCompany);
        System.out.println(firstCompany.numberOfEmployees());

        Company secondCompany = new Company("SecondCompany", "Nowe Miasto");
        ArrayList<Employee> secondEmployees = new ArrayList<>();
        secondEmployees.add(new Employee("Jan", "Anonim", 4000, 36));
        secondEmployees.add(new Employee("Adam", "Nowak", 3400, 40));
        secondEmployees.add(new Employee("Wojciech", "Kowalski", 4500, 25));
        secondEmployees.add(new Employee("Jan", "Kowalski", 3500, 35));
        secondCompany.setEmployees(secondEmployees);

        System.out.println(secondCompany);
        System.out.println(secondCompany.numberOfEmployees());
    }
}

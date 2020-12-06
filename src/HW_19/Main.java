package HW_19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "src/HW_19/Emploee";

        Employee employee1 = new Employee("Sara", 1, 3600);
        Employee employee2 = new Employee("Vasia", 2, 2500);
        Employee employee3 = new Employee("Vitalik", 3, 5000);
        Employee employee4 = new Employee("Solomiya", 4, 2000);


        Method method = new Method();
        method.serialise(str, employee1);
        Employee employeeRead = (Employee) method.deSerialize(str);
        System.out.println(employeeRead);

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        method.serialise(str, list);
        List<Employee> listRead;
        listRead = (List) method.deSerialize(str);
        System.out.println(listRead);

        Salary salary = new Salary(employee3.getSalary());
        method.serialise(str, salary);
        Salary salaryRead = (Salary) method.deSerialize(str);
        System.out.println(salaryRead);
    }
}

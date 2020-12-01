package HW_19;

import java.io.Serializable;

public class Salary implements Serializable {
    private static final long serialVersionUID = -5820917798534555676L;
    private int salary;

    public Salary(int salary) {
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }
}

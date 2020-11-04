package JavaCoreBasics.HW6.office;

import JavaCoreBasics.HW6.office.interfac.Taxes;
import JavaCoreBasics.HW6.office.interfac.WorkerSalary;


public abstract class Worker implements WorkerSalary, Taxes {
    private String name;
    private int salary;


    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract int salaryBuMonth();

    public abstract float getTaxes();

    public int getSalary() {
        return salary;
    }



    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

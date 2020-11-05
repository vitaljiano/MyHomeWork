package JavaCoreBasics.HW6.office.Workers;

import JavaCoreBasics.HW6.office.Worker;

import java.util.List;

public class SimpleWorkerByHour extends Worker {


    public SimpleWorkerByHour(String name, int salary) {
        super(name, salary);
    }

    @Override
    public int salaryBuMonth() {
        return (getSalary() * 8 * 20);
    }


    @Override
    public float getTaxes() {
        return (salaryBuMonth() * 0.02f);
    }

    @Override
    public int yearSalaryForCertainWorker() {
        return (salaryBuMonth() * 12);
    }
}

package JavaCoreBasics.HW6.office.Workers;

import JavaCoreBasics.HW6.office.Worker;

public class SimpleWorkerByMonth extends Worker {
    public SimpleWorkerByMonth(String name, int salary) {
        super(name, salary);
    }

    @Override
    public int salaryBuMonth() {
        return getSalary();
    }

    @Override
    public float getTaxes() {
        return (getSalary() *0.05f+1000);
    }

    @Override
    public int yearSalaryForCertainWorker() {
        return (getSalary() * 12);
    }
}

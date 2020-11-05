package JavaCoreBasics.HW6.office.Workers;

import JavaCoreBasics.HW6.office.Worker;

import java.util.ArrayList;
import java.util.List;

public class HeadWorker extends Worker {
    List<Worker> simpleWorker = new ArrayList();


    public HeadWorker(String name, int salary) {
        super(name, salary);
    }


    public void addSimpleWorker(Worker worker) {
        this.simpleWorker.add(worker);
    }

    public List<Worker> getSimpleWorker() {
        return simpleWorker;
    }

    @Override
    public int salaryBuMonth() {
        return getSalary();
    }


    @Override
    public float getTaxes() {
        return (getSalary() * 0.05f + 1000);
    }

    @Override
    public int yearSalaryForCertainWorker() {
        return (getSalary() * 12);
    }
}

package JavaCoreBasics.HW6.office;

import JavaCoreBasics.HW6.office.Workers.HeadWorker;
import JavaCoreBasics.HW6.office.interfac.WorkerSalary;
import JavaCoreBasics.HW6.office.interfac.StatisticForDepartment;

import java.util.ArrayList;
import java.util.List;

public class Department implements StatisticForDepartment {
    private String name;

    public Department(String name) {
        this.name = name;

    }

    private List<Worker> workers = new ArrayList<>();
    private HeadWorker headWorkers;

    public String getName() {
        return name;
    }

    public void addHeadWorker(Worker worker) {
        this.workers.add(worker);
        this.headWorkers = (HeadWorker) worker;

    }

    public HeadWorker getHeadWorkersWorkers() {
        return headWorkers;
    }

    public void addWorker(Worker worker) {

        this.workers.add(worker);
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    @Override
    public int numberOfWorkerFromDepartment() {

        return workers.size();
    }

    @Override
    public int numberOfWorkerForHead() {

        return headWorkers.getSimpleWorker().size();
    }


    @Override
    public int maxSalaryOfDepartment() {
        int maxSalary = 0;
        for (int i = 0; i < workers.size(); i++) {
            if (maxSalary < workers.get(i).salaryBuMonth())
                maxSalary = workers.get(i).salaryBuMonth();
        }
        return maxSalary;
    }
}

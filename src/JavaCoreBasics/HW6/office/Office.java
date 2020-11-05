package JavaCoreBasics.HW6.office;

import JavaCoreBasics.HW6.office.interfac.StatisticForOffice;

import java.util.ArrayList;
import java.util.List;

public class Office implements StatisticForOffice {
    private String name;
    List<Department> department = new ArrayList<>();

    public void addDepartment(Department department) {
        this.department.add(department);
    }

    public Office(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int generalNumberOfWorkers() {
        int number = 0;
        for (int i = 0; i < department.size(); i++) {
            number += department.get(i).getWorkers().size();

        }
        return number;
    }

    @Override
    public float averageSalaryOfOffice() {
        int number = 0;
        for (int i = 0; i < department.size(); i++) {
            number += department.get(i).getWorkers().size();

        }
        int salary = 0;

        int avarage = 0;
        for (int i = 0; i < department.size(); i++) {
            for (int j = 0; j < department.get(i).getWorkers().size(); j++) {
                salary += department.get(i).getWorkers().get(j).salaryBuMonth();
                avarage++;
            }
        }
        salary = salary / avarage;

        return salary;
    }

    @Override
    public int numberOfHeadWorker() {

        return department.size();
    }

    @Override
    public int numberOfSimpleWorker() {
        int number = 0;
        for (int i = 0; i < department.size(); i++) {
            number += department.get(i).getHeadWorkersWorkers().getSimpleWorker().size();
        }
        return number;
    }
}

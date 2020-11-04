package JavaCoreBasics.HW6.office;

import JavaCoreBasics.HW6.office.Workers.HeadWorker;
import JavaCoreBasics.HW6.office.Workers.SimpleWorkerByHour;
import JavaCoreBasics.HW6.office.Workers.SimpleWorkerByMonth;

public class Main {


    public static void main(String[] args) {
// Створюємо керівників та звичайних працівників
        Worker worker1 = new HeadWorker("Vasia", 20000);
        Worker worker2 = new SimpleWorkerByHour("Tamara", 75);
        Worker worker3 = new SimpleWorkerByMonth("Fedia", 15000);
        Worker worker4 = new SimpleWorkerByHour("Vitalik", 72);
        Worker worker5 = new SimpleWorkerByHour("Tamara", 68);
        Worker worker6 = new HeadWorker("Solomia", 12000);
        Worker worker7 = new SimpleWorkerByMonth("Anton", 13000);
        Worker worker8 = new SimpleWorkerByHour("Tima", 80);

// Створюємо відділи
        Department developers = new Department("Розробники");
        Department recruitment = new Department("Рекрутори");

// Додаємо працівників до відділу (за умовою в одному відділі - один керівник)
        developers.addHeadWorker(worker1);
        developers.addWorker(worker2);
        developers.addWorker(worker3);
        developers.addWorker(worker4);
        developers.addWorker(worker5);
        recruitment.addHeadWorker(worker6);
        recruitment.addWorker(worker7);
        recruitment.addWorker(worker8);
//Створюємо загальну компанію
        Office office = new Office("SomeCorporation");

// Додаємо до компанії відділи
        office.addDepartment(developers);
        office.addDepartment(recruitment);

// Закріплюємо закожним керівником певного працівника
        developers.getHeadWorkersWorkers().addSimpleWorker(worker2);
        developers.getHeadWorkersWorkers().addSimpleWorker(worker3);
        developers.getHeadWorkersWorkers().addSimpleWorker(worker4);
        developers.getHeadWorkersWorkers().addSimpleWorker(worker5);

        recruitment.getHeadWorkersWorkers().addSimpleWorker(worker7);
        recruitment.getHeadWorkersWorkers().addSimpleWorker(worker8);

//  ---------------------- Виводим запити -----------------------------------

        System.out.println("Загальна к-сть працівників по офісу: " + office.generalNumberOfWorkers());
        System.out.println("Середня зарплата по офісу: " + office.averageSalaryOfOffice());
        System.out.println("К-сть керівників: " + office.numberOfHeadWorker());
        System.out.println("К-сть простих робочих: " + office.numberOfSimpleWorker());

        System.out.println("К-сть працівників по відділу: " + developers.getName() +
                ": " + developers.numberOfWorkerFromDepartment());
        System.out.println("К-сть працівників по відділу: " + recruitment.getName() +
                ": " + recruitment.numberOfWorkerFromDepartment());
        System.out.println("Керівники відділів : " + developers.getHeadWorkersWorkers().getName()
                + ", " + recruitment.getHeadWorkersWorkers().getName());
        System.out.println("К-сть працівників за певним керівником "+ developers.getHeadWorkersWorkers().getName()
              + " - " + developers.numberOfWorkerForHead());
        System.out.println("К-сть працівників за певним керівником "+ recruitment.getHeadWorkersWorkers().getName()
             +" - "   + recruitment.numberOfWorkerForHead());
        System.out.println("Максимальна зарплата по вівдділу "+ developers.getName() + ": " +
                developers.maxSalaryOfDepartment());
        System.out.println("Максимальна зарплата по вівдділу "+ recruitment.getName() + ": " +
                recruitment.maxSalaryOfDepartment());
        System.out.println(" Річна зарплата працівника "+ worker1.getName() + ": " + worker1.yearSalaryForCertainWorker());
        System.out.println(" Річна зарплата працівника "+ worker3.getName() + ": " + worker3.yearSalaryForCertainWorker());
        System.out.println(" Річна зарплата працівника "+ worker5.getName() + ": " + worker5.yearSalaryForCertainWorker());
        System.out.println("Податок працівника " + worker1.getName() + ": " + worker1.getTaxes());
        System.out.println("Податок працівника " + worker3.getName() + ": " + worker3.getTaxes());
        System.out.println("Податок працівника " + worker5.getName() + ": " + worker5.getTaxes());

    }
}

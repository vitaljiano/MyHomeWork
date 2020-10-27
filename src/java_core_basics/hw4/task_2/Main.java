package java_core_basics.hw4.task_2;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Black", 3, "Diesel");
        toyota.showMeCar(toyota);
        Car mazda = new Car("Blue", 0, "gasoline");
        mazda.wheel.setRadius(18);
        mazda.wheel.setWinterOrSummer("Winter");
        mazda.wheel.setProfil(35);
        mazda.wheel.setWidth(215);
        mazda.showMeCar(mazda);

    }


}

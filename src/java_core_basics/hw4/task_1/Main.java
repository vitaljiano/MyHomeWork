package java_core_basics.hw4.task_1;


import java_core_basics.hw4.task_1.robot.CoffeRobot;
import java_core_basics.hw4.task_1.robot.RobotCoocker;
import java_core_basics.hw4.task_1.robot.RobotDencer;



public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDencer robotDencer = new RobotDencer();
        RobotCoocker robotCoocker = new RobotCoocker();

        robot.work();
        coffeRobot.work();
        robotDencer.work();
        robotCoocker.work();

        Robot[] arrRobot = new Robot[4];
        arrRobot[0] = robot;
        arrRobot[1] = coffeRobot;
        arrRobot[2] = robotDencer;
        arrRobot[3] = robotCoocker;
        for (int i = 0; i < arrRobot.length; i++) {
            arrRobot[i].work();
        }

    }
}

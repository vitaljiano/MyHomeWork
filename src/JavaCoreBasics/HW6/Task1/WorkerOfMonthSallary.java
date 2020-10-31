package JavaCoreBasics.HW6.Task1;

public class WorkerOfMonthSallary implements Sallery{
    int sallary = 1200;
    @Override
    public int sallary() {
        int sallaryofYears = sallary*8*12;
        return sallaryofYears;
    }
}

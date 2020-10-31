package JavaCoreBasics.HW6.Task1;

public class WorkerOfHouerSallery implements Sallery {
    int sallary = 60;
    @Override
    public int sallary() {
        int sallaryofYears = sallary*12*365;
        return sallaryofYears;
    }
}

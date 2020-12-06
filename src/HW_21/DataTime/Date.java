package HW_21.DataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {
    private int dey;
    private int month;
    private int year;
    private int hour;
    private int minutes;
    private int seconds;


    public Date(int dey, int month, int year, int hour, int minutes, int seconds) {
        setDey(dey);
        setMonth(month);
        setYear(year);
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void convertDate() {
        LocalDate localDate = LocalDate.of(getYear(), getMonth(), getDey());
        System.out.println(localDate);
    }

    public void convertTime() {
        LocalTime localTime = LocalTime.of(getHour(), getMinutes(), getSeconds());
        System.out.println(localTime);
    }

    public void convertDateTime() {
        LocalDateTime localDateTime = LocalDateTime.of(getYear(), getMonth(), getDey(),
                getHour(), getMinutes(), getSeconds());
        System.out.println(localDateTime);
    }

    public int getDey() {
        return dey;
    }

    public void setDey(int dey) {
        this.dey = dey;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}

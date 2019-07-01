package ru.nabiev.task15;

public class Day {
    public boolean holiday;
    public String date;

    public boolean isHoliday() {
        return holiday;
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Day(boolean holiday, String date) {
        this.holiday = holiday;
        this.date = date;
    }

    public Day() {}

    @Override
    public String toString() {
        return "Day{" +
                "holiday=" + holiday +
                ", date='" + date + '\'' +
                '}';
    }
}

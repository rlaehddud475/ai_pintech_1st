package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;
    public void showDate() {
        System.out.printf("year=%d, month=%d day=%d%n",year,month,day);
    }

    public int getDay() {

        return day;
    }

    public void setDay(int day) {
     if(month==2&&day>28){
         day=28;
     }
        this.day = day;
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
}

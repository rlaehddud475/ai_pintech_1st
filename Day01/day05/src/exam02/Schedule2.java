package exam02;

public class Schedule2 {
private int year;
private int month;
private int day;
    public Schedule2( int year, int month,int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }
    public Schedule2(){
    this(2024,10,14);
        //        year=2024;
//        month=10;
//        day=14;
    }



    public int getDay() {
        return day;
    }

    public void setDay(int day) {
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
    public void showInfo(){
        System.out.printf("year=%d, month=%d, day=%d%n",year,month,day);

    }

    public void setYear(int year) {
        this.year = year;
    }
    public void printThis(){
        System.out.println(this);
    }
    public Schedule2 getThis(){
        return this;
    }
}

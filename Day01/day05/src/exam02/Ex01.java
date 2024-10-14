package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1=new Schedule();
/*s1.year=2024;
* s1.month=2;
* s1.day=31; 통제 불가*/

        //통제할수 있음
        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);
     int month= s1.getMonth();
     int year=s1.getYear();
     int day= s1.getDay();
        System.out.println(year+"년"+month+"월"+day+"일");
    }
}

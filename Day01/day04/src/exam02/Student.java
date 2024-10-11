package exam02;

public class Student {
    int id;
    String name;
    String major;
    /*
    *  따로 정의하지 않으면 기본적으로 생산되는 생성자
    * 자동으로 생성 된다
    */
    public Student(){}
    public void showInfo(){
        System.out.printf("id=%d, name=%s, major=%s%n",id,name,major);
    }
}

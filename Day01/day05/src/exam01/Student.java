package exam01;

public class Student {

   static int id; //학번
    String name;//학생명
    String major;//전공
public Student(){}
    public void showinfo(){
        System.out.printf("id=%d, name=%s, major=%s%n", id,name,major);
    }
    static void staticMethod(){
        System.out.println("정적 메서드");
        id=1000;
//        showinfo();
    stacticMethod2();
    }
    static void stacticMethod2(){

    }
}

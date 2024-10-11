package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Student s1=new Student(1001, "김이름","수학");
        Student s2= new Student();
        s2.showInfo();
        s1.showInfo();
    }
}

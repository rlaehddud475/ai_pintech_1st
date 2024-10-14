package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id=1000;
        s1.name="김이름";
        s1.major="수학";
        s1.showinfo();
    Student s2=new Student();
    s2.id=1001;
    s2.name="이이름";
    s2.major="영어";
    s2.showinfo();
    s1.showinfo();
    s2.staticMethod();//지양
    }

}

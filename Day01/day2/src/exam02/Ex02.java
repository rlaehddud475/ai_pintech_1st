package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int age = 30;

        if (age < 8) {
            System.out.println("유치원");
        } else if (age<14) {
            System.out.println("잼민이");
        }else if(age<17) {
            System.out.println("중딩");
        }else if (age<20){
            System.out.println("고삐리");
        }else {
            System.out.println("틀딱");
        }
    }
}
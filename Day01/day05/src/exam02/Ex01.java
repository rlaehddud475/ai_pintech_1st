package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule sc1=new Schedule();
        sc1.year=2024;
        sc1.month=2;
        sc1.day=31;//31이라는 잘못된 값을 검증하고 대입 통제하는 방법 없음
        sc1.showDate();
    }
}

package exam03;

public class A {
    int num1;//default:같은 패키지에서만 접근가능
    public int num2;
    private int num3;

    public void method(){//클래스 내부 -> 클래스 내에 정의된 메서드 정의 내부
        num3=100;
        System.out.println(num3);
    }
}

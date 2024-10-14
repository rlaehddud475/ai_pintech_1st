package exam03;

public class A {
    int num1;//default:같은 패키지에서만 접근가능
    public int num2;
    private int num3;// 같은 클래스 내부에서만 접근가능
    protected int num4;//defalut + 상속을 통한 외부 패키지 범위 클래스이 private

    //instance method : 객체 생성 이후 객체의 참조변수를 통해서만 호출가능
    public void method(){//클래스 내부 -> 클래스 내에 정의된 메서드 정의 내부
        num3=100;
        System.out.println(num3);
    }
}

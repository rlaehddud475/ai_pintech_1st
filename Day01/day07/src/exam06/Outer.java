package exam06;

public class Outer {
    static class Inner{
        static int num2=20;
        static void staticMethod(){}
        int num1=10;
    void innerMetond(){
//        num1=20; method(); 외부클래스의 인스턴스 변수, 인스턴스 메서드 접근 불가
    num2=30;
    staticMethod();
    }
    }
}

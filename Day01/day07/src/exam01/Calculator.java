package exam01;

public abstract class Calculator {
    public Calculator() {
        System.out.println("Calculator 생성자!");
    }
    public void method(){
        System.out.println("Calculator");
    }
    public abstract int add(int num1, int num2);
}

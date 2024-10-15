package exam03;

import javax.sound.sampled.Line;

public abstract class Calculator {
  int num=10;

  public Calculator() {
    System.out.println("Calculator 생성자 호출");
  }

  public abstract int add(int num1, int num2);
//    public abstract int sub(int num1, int num2);
}

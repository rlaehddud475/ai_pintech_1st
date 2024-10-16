package exam07;

public class Outer {
    class Inner {
        int add(int num1, int num2){
            return num1+num2;
        }
    }

    Inner in =new Inner();
    int result = in.add(10,20);
    void method(){
        System.out.println(result);
    }
}


package exam08;

import exam02.Calculator;

public class Outer {
    Calculator method(){
        Calculator cal = new Calculator(){
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            }
        };
        return cal;
    /*    int result = cal.add(10,20);
        System.out.println(result);*/
    }
}

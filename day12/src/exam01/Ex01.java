package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            }

        };
    }
    public static int add2(Calculator cal, int num1, int num2){

        return cal.add(num1,num2);
    }
}


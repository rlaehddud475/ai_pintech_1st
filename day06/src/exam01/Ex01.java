package exam01;

public class Ex01 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        try {
            int result = num1/num2;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("예외발생!");
        }
        System.out.println("매우 중요한 코드 실행....");
    }
}

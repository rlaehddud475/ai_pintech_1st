package exam01;

public class Ex04 {
    public static void main(String[] args) {
        try{
            String str = "abc";
            System.out.println(str.toUpperCase());
            int num1=10;
            int num2=0;
            int result = num1/num2;
            System.out.println(result);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

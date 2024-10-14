package exam01;

public class Ex03 {
    public static void main(String[] args) {


 try{
     String str = "abc";
     System.out.println(str.toUpperCase());
     int num1=10;
     int num2=0;
     int result = num1/num2;
     System.out.println(result);

 } catch (NullPointerException | ArithmeticException e){
     System.out.println(e.getMessage());
     System.out.println("1번");


     /*catch (NullPointerException e) {
     System.out.println(e.getMessage());
     System.out.println("1번");
 }catch (ArithmeticException e){
     System.out.println(e.getMessage());
     System.out.println("2번");
 }*/
 }
        System.out.println("실행완료");

    }
}

package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num1=10;
        //int num2=num1++; 대입(=) -> 증감연산(++)
        int num2=++num1; // 증감연선(++)->대입(=)
        System.out.println(num2);
        System.out.println(num1);
    }
}

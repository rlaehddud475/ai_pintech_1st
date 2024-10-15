package exam01;

public class Ex06 {
    public static void main(String[] args) {
        add(10,20);

    }
    static int add (int num1, int num2){
       try {

           return num1+num2;
       }finally{
           System.out.println("무조건 정상 실행");
        }

    }
}

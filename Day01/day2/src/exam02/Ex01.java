package exam02;

public class Ex01 {
    public static void main(String[] args) {
        int num = 15;
        if (num==10){//조건식이 참일때 실행함
            System.out.println("10 입니다.");
        }else {
            System.out.println("10이 아니무니다.");
        }

        String result = num==10? "10 입니다." : "10이 아닙니다.";
        System.out.println(result);
    }
}

package exam02;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService();

            service.process("user01","1234");
            System.out.println("로그인 완료");


    }
}

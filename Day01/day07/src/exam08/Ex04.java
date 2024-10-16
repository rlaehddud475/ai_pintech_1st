package exam08;

public class Ex04 {
    public static void main(String[] args) {
        A a = new A(){
            @Override
            public void methodA() {
                super.methodA();
            }
        };
    }
}

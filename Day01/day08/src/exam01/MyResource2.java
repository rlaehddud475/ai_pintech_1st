package exam01;

public class MyResource2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
    System.out.println("MyResourse2 자원 해제!");
    }
}

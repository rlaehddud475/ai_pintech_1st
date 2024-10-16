package exam04;

public interface C extends A,B{
    void methodC();
    @Override
    void methodA();

    @Override
    void methodB();
}

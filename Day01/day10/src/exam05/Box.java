package exam05;

public class Box<T,U> {
    private T item1;
    private U item2;

    public T method1(){
        return null;
    }
    //T,U는 Box 클래스로 부터 객체가 생성될때 결정
    public void method2(T t , U u){

    }
    //메서드가 호출 될때 T,U가 결정된다(매개변수의 값의 타입에따라) 
    public <T,U> void method3(T t , U u){

    }

}

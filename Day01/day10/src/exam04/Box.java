package exam04;

public class Box<T extends Fruit & Eatable> {
    private T item;

    public T getItem() {
        return item;
    }
//    private T[] items=new T[3]; new 연산자는 메모리 생성의 역할을 하는데, 자료형이 명확해야지만 할당 용량 계산 가능!
    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        String  info=item.info();
        return info;
    }
}

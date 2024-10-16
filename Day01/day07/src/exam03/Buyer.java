package exam03;

public interface Buyer {
    int NUM=10;
    void buy();
    default void order(){
        System.out.println("Byer-주문1");
    }
    private void privateMethod(){
        System.out.println("private 메서드");
    }
    static void staticMethod(){
        System.out.println("정적 메서드");
    }
}

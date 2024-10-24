package exam05;

public class Ex02 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox=new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        juicer.make2(appleBox);
        FruitBox<Fruit> grapeBox=new FruitBox<>();
        juicer.make2( grapeBox);
    }
}

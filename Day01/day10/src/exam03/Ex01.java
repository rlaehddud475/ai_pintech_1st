package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple());
        Apple apple=(Apple) appleBox.getItem();//형변환의 번거로움
        System.out.println(apple.info());

        Box graeBox = new Box();
        graeBox.setItem(new Grape());
        Grape grape=(Grape)graeBox.getItem();//형변환의 번거로움
        System.out.println(grape.info());
    }
}

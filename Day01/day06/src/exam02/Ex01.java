package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();//Tiger, Animal
        tiger.move();
        Bird bird=new Bird();//Bird, Animal
        bird.move();
        Human human=new Human();//Human, Animal
        human.move();
    }
}

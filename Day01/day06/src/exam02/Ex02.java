package exam02;



public class Ex02 {
    public static void main(String[] args) {
      /*  Animal[] animals=new Animal[3];
        animals[0]=new Tiger();
        animals[1]=new Bird();
        animals[2]=new Human();*/
        Animal[] animals={new Tiger(),new Bird(), new Human()};
        for (Animal animal:animals){
            animal.move();
        }
    }
}

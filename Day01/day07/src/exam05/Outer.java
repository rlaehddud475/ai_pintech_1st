package exam05;

public class Outer {
    class Inner{
       static int num=10;
        static int num1= 20;
        void method(){
            System.out.println(num);
            /*System.out.println(Outer.this.num1);*/

        }
    }
}

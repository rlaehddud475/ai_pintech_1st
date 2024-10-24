package exam01;

public class Ex03
{
    public static void main(String[] args) {
//        MyLamda my=(s)-> System.out.println(s);
//        MyLamda my2=s-> System.out.println(s);
        MyLamda my3=()-> System.out.println("출력");
        my3.print();
    }
}

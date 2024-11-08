package exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex02 {
    public static void main(String[] args) {
        try(FileOutputStream fos=new FileOutputStream("obj1.txt");
            ObjectOutputStream ood = new ObjectOutputStream(fos)){
            Person p1=new Person("이이름",40);
            ood.writeObject(p1);
            Person p2=new Person("김이름",30);
            ood.writeObject(p2);
    }catch (IOException e ) {
        e.printStackTrace();
        }
        }
}

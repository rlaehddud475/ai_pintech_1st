package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex03 {
    public static void main(String[] args) throws Exception{
        try(FileInputStream fis=new FileInputStream("obj1.txt");
            ObjectInputStream ois=new ObjectInputStream(fis)){
        Person p1=(Person) ois.readObject();
            System.out.println(p1);
     /*    String message =(String) ois.readObject();
            System.out.println(message);*/
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

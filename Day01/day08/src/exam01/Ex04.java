package exam01;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        //closeable, autoCloesable
        try(FileInputStream fis=new FileInputStream("a.txt")){
            Closeable closeable2=  fis;
            AutoCloseable closeable = fis;
/*closeable.close();*/
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
try( FileInputStream fis=new FileInputStream("a.txt")) {
int ch =fis.read();
    System.out.println((char) ch);
ch=fis.read();
    System.out.println((char)ch);
    ch=fis.read();
    System.out.println((char)ch);
    ch=fis.read();
    System.out.println((char)ch);
    ch=fis.read();
    System.out.println((char)ch);
}catch (IOException e){
    e.printStackTrace();
}
    }
}

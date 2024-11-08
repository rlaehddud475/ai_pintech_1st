package exam01;

import java.io.File;

public class Ex19 {
    public static void main(String[] args) throws  Exception{
        File dir=new File("D:/tmp/sub/sub2");
        if(!dir.exists()){
            dir.mkdirs();
        }
        File file= new File(dir,"test.txt");
        file.createNewFile();
    }
}

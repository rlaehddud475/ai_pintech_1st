package exam01;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex14 {
    public static void main(String[] args) {
        int total=0, count=0;
        try(FileInputStream fis=new FileInputStream("score.txt");
            DataInputStream dis=new DataInputStream(fis)){
    while (true){
        int score = dis.readInt();
     total+=score;
     count++;
    }
        }catch (EOFException e){
            double avg=total/(double)count;
            System.out.printf("합계 : %d, 평균 :%.2f",total,avg);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

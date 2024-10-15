package exam05;

public class StudyKdy {
    public static void main(String[] args) {
        int[] n = {2,6,7,9,10,12,50,70,79,99};
        int cnt =0;

        for(int i=0; i<10; i++){
            if (n[i]%2==0) {
               ++cnt;
            }
        }
        System.out.println("짝수는"+cnt+"개");
    }

}

package exam03;

public class Ex06 {
    public static void main(String[] args) {
        for (int i=2; i<10; i++){
            for (int j=1; j<10; j++){
                int total = i*j;
                if(i%2==0){
                    continue;
                }
                if (j%2==0){
                    continue;
                }
                System.out.println(i+"X"+j+"="+total);
            }
        }
    }
}

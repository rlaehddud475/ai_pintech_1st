package exam01;

public class Q4 {
    public static void main(String[] args) {
        for (int i = 2; i<10; i++){
            System.out.printf("--- %d단 --- %n",i);
            if (i%2==0){
                continue;
            }
            for (int j=1; j<10; j++){
                System.out.printf("%d X %d = %d%n" ,i,j,i*j);
            }
        }
    }
}

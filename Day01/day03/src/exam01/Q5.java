package exam01;

public class Q5 {
    public static void main(String[] args) {
        for (int i = 2; i<10; i++){
            System.out.printf("--- %d단 --- %n",i);
            for (int j=1; j<10; j++){
                if (i>j){
                    continue;
                }
                System.out.printf("%d X %d = %d%n" ,i,j,i*j);
            }
        }
    }
}

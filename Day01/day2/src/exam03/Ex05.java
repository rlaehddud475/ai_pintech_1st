package exam03;

public class Ex05 {
    public static void main(String[] args) {
    for (int i=2; i<10; i++){
        for (int j=1; j<10; j++){
            if(i>j){
                continue;

            }
            System.out.println(i+"X"+j+"="+(i*j));
        }
    }
    }
}

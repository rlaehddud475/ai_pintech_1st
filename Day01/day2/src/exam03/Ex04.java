package exam03;

public class Ex04 {
    public static void main(String[] args) {
    int total = 0;
    for (int i = 1; i<=100; i++){
//        if (i==50){
//            continue;//건너뛰기
//        }
        if (i%2==0){
continue;
        }
        total+=i;

        /*
        if(i==50){
            break;//반복중단하는 키워드
        }*/
    }
        System.out.println(total);

    }
}

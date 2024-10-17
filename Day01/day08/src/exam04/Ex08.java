package exam04;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
sum(10,20,30);
        sum(10,20,30,40);
        sum(10,20);
    }
    public static int sum(int... nums){
        System.out.println(Arrays.toString(nums));
        return 0;
    }
}

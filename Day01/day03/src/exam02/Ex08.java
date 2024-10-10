package exam02;

public class Ex08 {
    public static void main(String[] args) {
        int[][] nums=new int[2][3];
        nums[0][0]=10;
        nums[0][1]=20;
        nums[0][2]=30;
        nums[1][0]=40;
        nums[1][1]=50;
        nums[1][2]=60;
       for (int i=0; i<2; i++){
           for (int j=0; j<3; j++){
               System.out.println(nums[i][j]);
           }
       }

    }
}

package exam02;

public class Ex09 {
    public static void main(String[] args) {
        int [][] nums = {{10, 20, 30},{40,50,60}};
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums[i].length; j++){
                System.out.printf("%d행, %d열=%d%n",i,j,nums[i][j]);
            }
        }
    }
}

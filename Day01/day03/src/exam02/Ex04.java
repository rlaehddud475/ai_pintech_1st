package exam02;

public class Ex04 {
    public static void main(String[] args) {
//        int[] nums = {10,20,30,40};
//    int[]nums;
//    nums=new int[]{10,20,30,40};
        int[] nums = {10,20,30,40,50,60,70};
        System.out.printf("length=%d%n",nums.length);
//        for (int i=0; i<nums.length; i++){
//            System.out.println(nums[i]);
//        }
        for (int num:nums){
            System.out.println(num);
        }

    }
}

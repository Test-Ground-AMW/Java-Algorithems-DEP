public class SingleNumberAlgo {
    public static void main(String[] args) {

        do{
        
        int[] nums = {2,6,3,4,5,4,2,5,1,6,1,6,4};
        int length = nums.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
               if(nums[i]==nums[j]) {
                count++;
               }
            }
            if(count==0) System.out.println("Non repeat number is: "+nums[i]);
            count = 0;
        }
    }while(true);
    }
}

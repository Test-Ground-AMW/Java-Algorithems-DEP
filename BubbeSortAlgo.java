import java.util.Arrays;

public class BubbeSortAlgo {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 4, 3, 5, 7, 0, 2, -5, -3, -1 };
        int length = nums.length;

        loop:
        do {
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (nums[j] < nums[i]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            --length;
            if (length==0) break loop;
        } while (true);
        System.out.println(Arrays.toString(nums));
    }

}

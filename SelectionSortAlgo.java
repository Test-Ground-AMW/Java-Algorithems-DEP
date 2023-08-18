import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {

        int[] nums = { -5, 7, 2, -8, 4, 4, 0, 3, 50, -20 };

        int length = nums.length;

        for (int j = length; j >= 1; j--) {
            int index = 0;
            int max = nums[0];
            for (int i = 0; i < j; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    index = i;
                }
            }
            nums[index] = nums[j - 1];
            nums[j - 1] = max;
        }
        System.out.println(Arrays.toString(nums));
    }
}

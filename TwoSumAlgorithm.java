import java.util.Scanner;

public class TwoSumAlgorithm {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] nums = {1, 3, -2, -1, 4, 5, 7};
        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == (nums[i]+nums[j])){
                    System.out.print("sum of numbers are "+nums[i] + " " + nums[j] + "\n");
                }
            }
        }
        
    }
}

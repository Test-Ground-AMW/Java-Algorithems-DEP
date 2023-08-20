import java.util.Arrays;
import java.util.Scanner;

public class InsertionAlgo2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] nums = { -10, -5, 0, 3, 7, 9 };

        do {
            System.out.print("Enter the number: ");
            int insertion = scanner.nextInt();
            scanner.nextLine();

            int[] temp = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                if (insertion >= nums[i]) {
                    temp[i] = nums[i];
                } else {
                    temp[i] = nums[i-1];
                    if(insertion > nums[nums.length-1]) temp[temp.length-1]=insertion;
                }
            }
            System.out.println(Arrays.toString(temp));

        } while (true);
    }
}

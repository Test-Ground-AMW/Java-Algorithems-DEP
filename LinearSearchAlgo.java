import java.util.Scanner;

public class LinearSearchAlgo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] nums = { 2, 4, 5, 6, 8, 7, 3, 9, 15, 34, 6549, 2546, -24, -53, 56, 42 };

        loop:
        do {
            System.out.print("Enter a number to search: ");
            int search = scanner.nextInt();
            scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == search) {
                    System.out.println("Found at index: " + i);
                    continue loop;
                }
            }
            // if (!found)
                System.out.println("Not Found!");
        } while (true);
    }
}
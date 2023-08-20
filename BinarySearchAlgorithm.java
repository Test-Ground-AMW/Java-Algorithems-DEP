import java.util.Scanner;

public class BinarySearchAlgorithm {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loop: 
        do {
            int[] nums = { -5, -2, 0, 3, 5, 8, 10,13 };
            System.out.print("Enter a number to search: ");
            int search = scanner.nextInt();
            scanner.nextLine();

            int start = 0;
            int end = nums.length;

            while (true) {
                if (start >= end){
                    System.out.println("Not found!");
                    break loop;}
                int middle = (start + end) / 2;

                if (search == nums[middle]) {
                    System.out.println("Found at index " + middle);
                    break loop;
                } else if (search > nums[middle]) {
                    start = middle + 1;
                } else
                    end = middle;
            }
        } while (true);

    }
}

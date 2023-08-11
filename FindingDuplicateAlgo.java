import java.util.Scanner;

public class FindingDuplicateAlgo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] nums = { 1, 2, 5, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7 };

        do {
            int count = 0;
            int index = 0;
            int[] indexs = new int[50];

            System.out.print("Enter the number: ");
            int search = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < nums.length; i++) {

                if (search == nums[i]) {
                    count++;
                    indexs[i] = nums[i];
                    // indexs[i] = index;
                }
            }
            if (count == 1) System.out.println("No duplicates found");
            else if (count == 0) System.out.println("Number doesn't exists in the number list");
            else {
                System.out.println("Number of duplicats: " + count);
                System.out.print("Duplicats are founds at: ");

                for (int i = 0; i < indexs.length; i++) {
                    if (!(indexs[i] == 0)) {
                        System.out.print(i + ", ");
                    }
                }
                System.out.print("\b\b " + "\n");
            }

        } while (true);
    }
}

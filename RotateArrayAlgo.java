import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayAlgo {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5,6};

        System.out.print("Enter a number to rotate: ");
        int rotate = scanner.nextInt();
        scanner.nextLine();

        int rotation =rotate/(nums.length-1);
        int length = nums.length;
        int[] temp = new int[length];

        if (rotation>=0){
            for (int i = 0; i < rotation; i++) {
                temp[i]=0;
            }
        }
        
        // for (int i = 0; i < length-rotation; i++) {
        //     if (rotation>=0){
        //         for (int j = rotation; j < length; j++) {
        //             temp[j]=nums[i];
        //         }
        //     }
        // }
        System.out.println(Arrays.toString(temp));
    }
}

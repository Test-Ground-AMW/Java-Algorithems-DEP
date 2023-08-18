import java.util.Arrays;

public class PlusOneAlgorithm {

    public static void main(String[] args) {
        int[] nums = { 9, 9, 9, 1 };

        int pow = 1;
        int number = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            number += nums[i] * pow;
            pow *= 10;
        }

        number++;
        if ((number/pow)<=0) pow /= 10;
        System.out.println(number);

        int[] ans = new int[0];
        int i = 0;

        while (true) {
            int[] temp = new int[ans.length + 1];
            for(int j = 0; j < ans.length ; j++){
                temp[j]=ans[j];
            }
            temp[i] = number / pow;
            ans = temp;
            
            number %= pow;
            pow/=10;
            i++;
            if (pow<1) break;
        }
        System.out.println(Arrays.toString(ans));

        // int[] answer = new int[number / pow > 0 ? nums.length + 1: nums.length];

        // if (answer.length == nums.length) pow /= 10;
        // for (int i = 0; i < answer.length; i++) {
        //     answer[i] = number / pow;
        //     number %= pow;
        //     pow /= 10;
        //}

    }

}

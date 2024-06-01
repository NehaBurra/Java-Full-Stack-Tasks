package Data_Transmission;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numStrings = sc.nextLine().split(" ");
        int[] nums = new int[numStrings.length];
        for (int i=0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(numStrings[i]);
        }
        System.out.println();
        System.out.println(findSuffix(nums));
        System.out.println();

    }

    private static int findSuffix(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int max1 = 0;
        int max2 = 0;
        for (int j : nums) {
            if(isPrime(j)) {
                count++;
                max2 = max1;
                max1 = j;
            }
        }
        // System.out.println(Arrays.toString(nums));
        // System.out.println(count);
        // System.out.println(max2);
        return count + max2;
    }

    private static boolean isPrime(int j) {
        if(j<2) {
            return false;
        }
        for(int i = 2; i < j ; i++) {
            if(j%i==0)
                return false;
        }
        return true;
    }
}

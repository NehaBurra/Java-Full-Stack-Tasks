package Reverse_Number;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int reverseNumberResult = reverseNumber(num);
        System.out.println(reverseNumberResult);
    }

    public static int reverseNumber(int num) {
        int reverseNumbeResult = 0; 
        while (num > 0) { 
            reverseNumbeResult = reverseNumbeResult * 10 + num % 10; 
            num = num / 10; 
        } 
        return reverseNumbeResult; 
    }
}

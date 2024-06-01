package Reverse_String;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverseStringResult = reverseString(str);
        System.out.println(reverseStringResult);
    }

    public static String reverseString(String str) {
        String reverseString = "";
        for (int i=0; i<str.length(); i++)
        {
            char ch= str.charAt(i); 
            reverseString= ch+reverseString;
        }
        return reverseString.toLowerCase();
    }
}

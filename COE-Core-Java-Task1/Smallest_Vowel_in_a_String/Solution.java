package Smallest_Vowel_in_a_String;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char smallestVowel = getSmallestVowel(str);
        System.out.println(smallestVowel);
    }

    private static char getSmallestVowel(String str) {
        char minVowel='u';
        char ch,temp;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                    temp=ch;
                    if(temp<minVowel)
                    {
                        minVowel=temp;
                    }
            }
        }
        return minVowel;
    }
}

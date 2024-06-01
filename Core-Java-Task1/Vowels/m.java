package ex1;
import java.util.Scanner;
public class m {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inp = sc.nextLine().toLowerCase();

        int vow = 0;
        int conso = 0;

        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            if ((ch >= 'a' && ch <= 'z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vow++;
                } else {
                    conso++;
                }
            }
        }

        System.out.println("Vowels count : " + vow);
        System.out.println("Consonants count : " + conso);
	}
}

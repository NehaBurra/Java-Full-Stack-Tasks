package unchar;
import java.util.*;
public class UniChar {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a string:");
		        String input = scanner.nextLine().toLowerCase();

		        StringBuilder uniqueChars = new StringBuilder();

		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            if (isUnique(input, ch, i)) {
		                uniqueChars.append(ch);
		            }
		        }

		        System.out.println("Output:"+uniqueChars.toString());
		        //System.out.println(uniqueChars.toString());
		    }

		    private static boolean isUnique(String str, char ch, int index) {
		        for (int i = 0; i < str.length(); i++) {
		            if (i != index && str.charAt(i) == ch) {
		                return false;
		            }
		        }
		        return true;
		    }
		


	}



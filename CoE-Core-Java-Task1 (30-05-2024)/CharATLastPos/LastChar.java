package lastChar;
import java.util.*;
public class LastChar {
	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        String inp = scanner.nextLine();

		        StringBuilder out = new StringBuilder();

		        String[] words = inp.split(" ");

		        for (String word : words) {
		            String c = word.replaceAll("[\\d]", "");

		            if (!c.isEmpty()) {
		                out.append(c.charAt(c.length() - 1));
		            }
		        }

		        System.out.println(out.toString());
		    }
		}

			
		



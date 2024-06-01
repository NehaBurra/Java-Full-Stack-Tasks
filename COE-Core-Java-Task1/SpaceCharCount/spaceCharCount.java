package SpaceChar;
import java.util.*;
public class spaceCharCount {

	public static void main(String[] args) {
		

		        Scanner sc = new Scanner(System.in);
		        String str = sc.nextLine();

		        int spaces = 0;
		        int characters = 0;

		        for (char ch : str.toCharArray()) {
		            if (Character.isDigit(ch)) {
		                continue;
		            }
		            if (ch == ' ') {
		                spaces++;
		            } else { 
		                characters++;
		            }
		        }

		        System.out.println("No of spaces : " + spaces + " and characters : " + characters);
		    }
		

	}



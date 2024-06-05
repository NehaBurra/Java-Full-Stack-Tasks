package upperLowerCase;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class upperLowerCase {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			String s=sc.nextLine();
			if(s.equals("end"))
				break;
			str.add(s);
		}
		ArrayList<String> upCase=(ArrayList<String>) str.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		
		ArrayList<String> lowCase=(ArrayList<String>) str.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		
	System.out.println("original String:"+str);
	System.out.println("String after converting to uppercase:"+upCase);
	System.out.println("String after converting to lowercase:"+lowCase);
	}

}

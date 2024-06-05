package sumOfevnOdd;
import java.util.*;
public class sumOfevnOdd {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String s;
		while(sc.hasNext())
		{
			s=sc.nextLine();
			if(s.equals("end"))
				break;
			int num=Integer.parseInt(s);
			list.add(num);
		}
		int sumOfEven=list.stream()
				.filter(x->(x%2==0))
				.mapToInt(Integer::intValue)
                .sum();
		int sumOfOdd=list.stream()
				.filter(x->x%2!=0)
				.mapToInt(Integer::intValue)
                .sum();
		System.out.println("sum of even numbers:"+sumOfEven);
		System.out.println("sum of odd numbers:"+sumOfOdd);
	}

}

package averagOfList;
import java.util.*;
//import java.util.stream.*;
public class averageOfList {

	public static void main(String[] args) {
		ArrayList <Integer>list= new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext())
		{
			String i=sc.nextLine();
			if (i.equals("end"))
					{
				       break;
					}
			int num=Integer.parseInt(i);
			list.add(num);
		}
		
		OptionalDouble avg=list.stream().mapToDouble(Integer::doubleValue).average();
		System.out.println("Average of list:"+avg);
	}
}
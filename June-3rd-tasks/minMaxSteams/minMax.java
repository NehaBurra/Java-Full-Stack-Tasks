package minMax;

import java.util.ArrayList;
import java.util.Scanner;

public class minMax {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			
			String s=sc.nextLine();
			if(s.equals("end"))
				break;
			int num=Integer.parseInt(s);
			list.add(num);
		}
		if(list.isEmpty())
			System.out.println("List is empty");
		else
		{
			int min =findMin(list);
			int max=findMax(list);
			System.out.println("Maximum element is :"+max);
			
			System.out.println("Minimum element is :"+min);
		}
	}
	public static int findMax(ArrayList<Integer> list)
	{
		int max=Integer.MIN_VALUE;
		for(int num:list)
		{
			if(num>max)
				max=num;
		}
		return max;
	}
	public static int findMin(ArrayList<Integer> list)
	{
		int min=Integer.MAX_VALUE;
		for(int num:list)
		{
			if(num<min)
				min=num;
		}
		return min;
	}
	

}

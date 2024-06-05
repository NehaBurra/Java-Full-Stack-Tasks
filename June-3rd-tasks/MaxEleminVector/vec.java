package com.vector.examp;
import java.util.ArrayList;
import java.util.Scanner;
public class vec {

	public static void main(String[] args) {
		ArrayList <Integer> v=new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext())
		{
			String str=sc.nextLine();
			if(str.equals("end")) {
				break;
			}
			int num=Integer.parseInt(str);
			v.add(num);
			
		}
		if (v.isEmpty())
		{
			System.out.println("vector is empty");
		}
		else 
		{
			int max=findMax(v);
			System.out.println("Max element is :"+max);
		}
		
	}
		public static int findMax(ArrayList<Integer> v)
		{
			int m=Integer.MIN_VALUE;
			for(int num:v)
			{
				if(num>m)
					m=num;
			}
			return m;
		
	
		
	}

}

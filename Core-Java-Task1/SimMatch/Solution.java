package Sim;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Sim sim[]=new Sim[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			int simId=Integer.parseInt(sc.nextLine());
			String customerName=sc.nextLine();
			double balance=Double.parseDouble(sc.nextLine());
			double ratePerSecond=Double.parseDouble(sc.nextLine());
			String circle=sc.nextLine();
			sim[i]=new Sim(simId,customerName,balance,ratePerSecond,circle);
		}
		String Circle1=sc.nextLine();
		String Circle2=sc.nextLine();
		
		Sim[] a=transferCircle(sim,Circle1, Circle2);
		for (Sim s : a) {
            System.out.println(s.getSimId() + " " + s.getCustomerName() + " " + s.getCircle() + " " + s.getRatePerSecond());
		}
	}
	
	public static Sim[] transferCircle(Sim sim[], String Circle1, String Circle2)
	{
		
		Sim[] Str=Arrays.stream(sim).filter(s->s.getCircle().equals(Circle1)).sorted((s1,s2)->Double.compare(s2.getRatePerSecond(),s1.getRatePerSecond())).toArray(Sim[]::new);
		
		for(Sim s:Str)
		{
			s.setCircle(Circle2);
		}
		return Str;
		
	}

}


/*
1
raju
130
1.32
mum
2
sachin
120
2.26
ahd
3
ram
200
2.54
kol
4
shubham
640
3.21
ahd
5
kalpesh
150
1.8
ahd
ahd
kol
*/
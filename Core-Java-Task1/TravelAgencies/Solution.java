package trav;
import java.util.*;
public class Solution {

	public static void main(String[] args) {		
		TravelAgencies travelAgencies[]=new TravelAgencies[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			//System.out.println("enter travel Agency detail"+i);
			int regNo = Integer.parseInt(sc.nextLine());
//			System.out.println(regNo);
			String agencyName = sc.nextLine();
//			System.out.println("a "+agencyName);
			String packageType = sc.nextLine();
//			System.out.println("p" +packageType);
			int price = Integer.parseInt(sc.nextLine());
//			System.out.println(price);
			boolean flightFacility = Boolean.parseBoolean(sc.nextLine());
//			System.out.println(flightFacility);
			travelAgencies[i]=new TravelAgencies(regNo,agencyName,packageType,price,flightFacility);
			
		}
		int r=Integer.parseInt(sc.nextLine());
		String p=sc.nextLine();
		int HighestPrice=findAgencyWithHighestPackagePrice(travelAgencies);
		System.out.println(HighestPrice);
		//System.out.println("enter regno and packagetype:");
		TravelAgencies x= agencyDetailsForGivenldAndType(travelAgencies,r,p);
		System.out.println(x.getPackageType()+":"+x.getPrice());
		
	}
	public static int findAgencyWithHighestPackagePrice(TravelAgencies travelAgencies[])
	{
		int m=0;
		for(TravelAgencies p:travelAgencies )
		{
			if(p.getPrice()>m)
				m=p.getPrice();
		}
		return m;
	}
	
	public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies travelAgencies[], int regNo, String packageType)
	{
		for (TravelAgencies t:travelAgencies )
		{
			if(t.getRegNo()==regNo && t.getPackageType().equals(packageType)&& t.isFlightFacility())
			{
				return t;
			}
		}
		return null;
	}
}

/*
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
**/


package perfectSquare;
import java.util.*;
public class perfectSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		if(checkPerfect(num))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");

			
		}
	}
		static boolean checkPerfect(double num){
			for(int i=1;i*i<=num;i++)
			{
				if((num%i==0) && (num/i==i))
				{
					return true;
				}
				
			}
			return false;
			
		}	
		

}



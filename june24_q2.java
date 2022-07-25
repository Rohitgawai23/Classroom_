1)1: WAP  print the total sum of square  from 1 to 10;
  Number   Square
Total            Value 
---------------------------------------------------------------------------------------------------------------------------------------
class SquareSum
{
	public static void main(String args[])
	{
		int i=1;
		int sum=0;
		System.out.println("\tNumber\t|  Square");
		System.out.println("\t-------------------");
		while(i<=20)
		{
			sum=sum+(i*i);
			System.out.println("\t"+i+"\t|  "+(i*i));
			i++;
		}
		System.out.println("\t-------------------");
		System.out.println("\tTotal\t|  "+sum);
				
	}
}
--------------------------------------------------------------------------------------------------------------------------------------------------
2)2: WAP find the difference between even and odd number  from 201 to 400;
    Total Even Number :
    Total Odd Number :
     Difference 
    Count of Even Number  :
    Count of Odd Number:
---------------------------------------------------------------------------------------------------------------------------------------------------
class EvenOdd
{
	public static void main(String args[])
	{
		int i=201;
		int e=0,o=0;
		int esum=0,osum=0;
		System.out.println("\t-------------------");
		while(i<=400)
		{
			if(i%2==0)
			{
				e++;
				esum=esum+i;
			}
			else
			{
				o++;
				osum=osum+i;
			}	
			i++;
		}
		System.out.println("\t-------------------");
		System.out.println("\tTotal Of Even\t=  "+esum);
		System.out.println("\tTotal Of Odd \t=  "+osum);
		System.out.println("\tDifference   \t=  "+(esum-osum));
		System.out.println("\tCount Of Even\t=  "+e);
		System.out.println("\tCount Of Odd \t=  "+o);
				
	}
}
---------------------------------------------------------------------------------------------------------------------------------------------------
3:WAP  calculate simple interest for 3 years , Amount rate and time inputted by user.
--------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
class SimpleInterest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float p,r,t,temp=1;
		float si=0.0f,sum=0f;
		System.out.print("Enter Principle Amount: ");
		p=sc.nextFloat();
		float tp=p;
		System.out.print("Enter rate            : ");
		r=sc.nextFloat();
		System.out.print("Enter Time            : ");
		t=sc.nextFloat();
		System.out.println("\tYear\tPrinciple Amount\tRate\tSimpleInterest\tTotal Pay");
		while(temp<=t)
		{
			si=(tp*r*temp)/100;
			tp=tp+si;
			System.out.println("\t"+temp+"\t       "+p+"\t\t "+r+"\t    "+si+"\t"+tp);
			temp++;
		}
			System.out.println("\t\t\t\t\t------------------------");
			System.out.println("\t\t\t\t\tTotal Pay = "+tp);
			
	}
}

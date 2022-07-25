1: WAP print all numbers  which is divisible by 11 from  22 to 400;
---------------------------------------------------------------------------------------------------------------------------------------------------
class Div11
{
	public static void main(String args[])
	{
		int i=22;
		while(i<=400)
		{
			if(i%11==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}
	}
}
---------------------------------------------------------------------------------------------------------------------------------------------------
2: WAP print Square of each number from 1 to 20:
     Number       Square
      4                   16
---------------------------------------------------------------------------------------------------------------------------------------------------
class Square
{
	public static void main(String args[])
	{
		int i=1;
		System.out.println("\tNumber\t|  Square");
		System.out.println("\t-------------------");
		while(i<=20)
		{
			System.out.println("\t"+i+"\t|  "+(i*i));
			i++;
		}
				
	}
}
---------------------------------------------------------------------------------------------------------------------------------------------------
3: WAP input a number and print the Table of it.
      2  x 1= 2
      2  x  2 = 2
---------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=1;
		System.out.print("\tEnter number: ");
		int n=sc.nextInt();
		System.out.println("\t-------------------");
		while(i<=10)
		{
			System.out.println("\t"+n+"*"+i+"\t=  "+(i*n));
			i++;
		}
				
	}
}
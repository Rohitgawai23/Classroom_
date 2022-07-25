import java.util.Scanner;
class SwitchVowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter character: ");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'A':
			{	
				System.out.println("Char is vowel.");
				break;
			}
			case 'a':
			{	
				System.out.println("Char is vowel.");
				break;
			}
			case 'e':
			{	
				System.out.println("Char is vowel.");
				break;
			}
			case 'E':
			{	
				System.out.println("Char is vowel.");
				break;
			}
			case 'i':
			{	
				System.out.println("Char is vowel.");
				break;
			}
			case 'I':
			{	
				System.out.println("Char is vowel.");
				break;
			}
			case 'o':
			{	
				System.out.println("Char is vowel.");
				break;
			}
			case 'O':
			{	
				System.out.println("Char is vowel.");
				break;
			}
			case 'u':
			{	
				System.out.println("Char is vowel.");
				break;
			}
			case 'U':
			{	
				System.out.println("Char is vowel.");
				break;
			}
			case default:
			{	
				System.out.println("Char is not vowel.");
				break;
			}
		}
		
	}
}
import java.util.Scanner;
public class Assignment12 {
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be checked");
		int num=sc.nextInt();
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("the number is not prime");
				break;
				
			}
			else
			{
				System.out.println("number is prime number");
				break;
			}
		}

	}

}

import java.util.Scanner;

public class Assignment17 {
	static int reverse;
	static int digit;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be reversed");
		int Num=sc.nextInt();
		while(Num!=0)
		{
		 digit=Num%10;
		 reverse=reverse*10 + digit;
		 Num=Num/10;
		 //continue;
		}
		System.out.println("your reverse number is:" +reverse);
	}

}

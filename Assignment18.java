import java.util.Scanner;

public class Assignment18 {
	static int reverse;
	static int digit;
	static int temp;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be reversed");
		int Num=sc.nextInt();
		temp=Num;
		while(Num!=0)
		{
		 digit=Num%10;
		 reverse=reverse*10 + digit;
		 Num=Num/10;
		 //continue;
		}
		System.out.println("your reverse number is:" +reverse);
		if(temp==reverse)
		{
			System.out.println(reverse +" is a palindrom");
		}
		else
		{
			System.out.println(reverse + " is not palindrom");
		}
	}

}

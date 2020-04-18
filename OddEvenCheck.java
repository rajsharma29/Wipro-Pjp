 import java.util.Scanner;
public class OddEvenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input to check");
		int Num=sc.nextInt();
		if(Num%2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
		
	}

}

import java.util.Scanner;
public class Assignment8 
{

	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the color code");
	 String code=sc.nextLine();
	if(code.equals("R"))
	 {
	System.out.print("RED");
	 }
	 else if(code.equals("B"))
	 {
	 System.out.print("Blue");
	 }
	 else if(code.equals("G"))
	 {
	 System.out.print("Green");
	 }
	 else if(code.equals("O"))
	 {
	 System.out.print("Orange");
	 }
	 else if(code.equals("Y"))
	 {
	 System.out.print("Yellow");
	 }
else
	 {
		 System.out.print("please enter valid color code");
	 }
	}

}

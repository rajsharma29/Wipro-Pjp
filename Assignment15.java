import java.util.Scanner;

public class Assignment15 {
 static int sum=0;
	public static void main(String[] args) 
	{
	      int number = Integer.parseInt(args[0]);
	    
	      // for(int i=0;i<args.length;i++)
	      while(number!=0)
	      {
	    	 
	    	  sum=sum+number%10;
	    	  number=number/10;
	      }
	      System.out.print("sum of number: " +sum);
	}

}

import java.util.Scanner;
public class ReverseOfNumber {

	
	// Reverse a number
	
	public void reverseOfNumber()
	{
	      int n, reverseOfNum = 0;
	 
	      System.out.println("Enter the number ");
	      Scanner in = new Scanner(System.in);
	      n = in.nextInt();
	 
	      while( n != 0 )
	      {
	    	  reverseOfNum = reverseOfNum * 10;
	    	  reverseOfNum = reverseOfNum + n%10;
	          n = n/10;
	      }
	 
	      System.out.println("Reversed number is "+reverseOfNum);
	      

	
   public static void main(String[]args)
	   {
		ReverseOfNumber ST =new ReverseOfNumber();
		ST.reverseOfNumber();
	    }
}

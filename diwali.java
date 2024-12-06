import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
 Scanner scanner = new Scanner(System.in);
        
        
        
        int A = scanner.nextInt();
        
        
        int B = scanner.nextInt();
        
        
        int amountToPay = (B >= A) ? 0 : A - B;
        
        
        System.out.println( amountToPay);
        
        
        scanner.close();
    }
}
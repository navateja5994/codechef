import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        if (Y <= 2 * X) {
            System.out.println("Metal");
        } else {
            System.out.println("Plastic");
        }
        
        sc.close();

	}
}

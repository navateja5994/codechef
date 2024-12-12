import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int G = sc.nextInt();
        int S = sc.nextInt();
        int B = sc.nextInt();
        
        int goldNeeded = Math.max(0, 5 - G);
        int silverNeeded = Math.max(0, 5 - S);
        int bronzeNeeded = Math.max(0, 5 - B);
        
        int totalNeeded = goldNeeded + silverNeeded + bronzeNeeded;
        System.out.println(totalNeeded);

	}
}

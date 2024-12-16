import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            if (Y > X) {
                System.out.println("PROFIT");
            } else if (Y < X) {
                System.out.println("LOSS");
            } else {
                System.out.println("NEUTRAL");
            }
        }

	}
}

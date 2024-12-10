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
        int Z = sc.nextInt();
        int cost = Math.min(2 * X + 3 * Y, 2 * Z + Y);
        System.out.println(cost);
        sc.close();

	}
}

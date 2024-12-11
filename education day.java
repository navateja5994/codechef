import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int chefSales = A * C;
        int chefinaSales = B * C;
        
        System.out.println(Math.max(chefSales, chefinaSales));

	}
}

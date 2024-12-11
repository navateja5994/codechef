import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        int C1 = sc.nextInt();
        int C2 = sc.nextInt();
        
        int totalScore = Math.max(A1, A2) + Math.max(B1, B2) + Math.max(C1, C2);
        System.out.println(totalScore);

	}
}

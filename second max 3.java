import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int secondMax = a + b + c - Math.min(a, Math.min(b, c)) - Math.max(a, Math.max(b, c));
            System.out.println(secondMax);
        }

	}
}

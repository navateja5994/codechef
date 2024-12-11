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
            int N = sc.nextInt();
            System.out.println((X / 10) * N);
        }

	}
}

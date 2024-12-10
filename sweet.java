import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int remainingMoney = X - (N * 10);
        int jalebis = remainingMoney / 20;
        System.out.println(jalebis);
        sc.close();

	}
}

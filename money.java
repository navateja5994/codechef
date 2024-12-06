import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        int totalMoney = (X * 5000) + (Y * 9800);
        
        System.out.println(totalMoney);
        
        scanner.close();
    }
}
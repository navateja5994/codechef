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
        
        int messCost = X * 6;
        int restaurantCost = Y;
        
        int totalCost = messCost + restaurantCost;
        
        System.out.println(totalCost);
        
        scanner.close();
    }
}
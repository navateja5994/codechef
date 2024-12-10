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

        int caloriesEaten = Y * Z;
        int remainingCalories = X - caloriesEaten;

        if (remainingCalories < 0) {
            System.out.println(-1);
        } else {
            System.out.println(remainingCalories);
        }

	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        
        if (score >= 12) {
            System.out.println("Qualified");
        } else {
            System.out.println("Not Qualified");
        }
        
        sc.close();
    }
} 
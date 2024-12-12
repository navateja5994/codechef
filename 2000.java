import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int totalAmount = N * 2000;
        int notesNeeded = totalAmount / 500;
        
        System.out.println(notesNeeded);

	}
}

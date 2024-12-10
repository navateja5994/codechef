import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt(); // Read the number of hours slept
        
        if (H < 8) {
            System.out.println("LESS");
        } else if (H == 8) {
            System.out.println("PERFECT");
        } else {
            System.out.println("MORE");
        }

	}
}

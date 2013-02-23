/*
  File: Hailstone.java

  Description: Prompt user for a minimum and maximum range for the Hailstone Sequence and output the number that has the longest sequence and output the # of steps it requires

  Student Name: Steven Lee

  Date Created: 2/21/2012

  Date Last Modified: 2/23/12

*/


import java.util.Scanner;
public class Hailstone 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int i = 0;
		int count = 0;
		int longCount = 0;
		int longest = 0;
		int origNum = 0;
		int start = 0;
		int end = 0;
		//prompt user for range

		//check negative
		do
		{
			System.out.print ("Enter starting number of the range: ");
			start = sc.nextInt();
			while (start < 1)
			{
				System.out.print ("Starting number for range must be greater than 0. Try again: ");
				start = sc.nextInt();
			}
			System.out.print ("Enter ending number of the range: ");
			end = sc.nextInt();
			//check negative
			while (end < 1)
			{
				System.out.print ("Ending number for range must be greater than starting number. Try again: ");
				end = sc.nextInt();
			}
		}
		while (end < start);
		
		//loop for input range
		for (i = start; i <= end; i++)
		{
			//set count and original Number if it is longest
			origNum = i;
  			count = 0;
  			int n = i;
			//set loop until number in question hits 1, also provide the 2 conditions: one for even, another for odd
  			while (n != 1)
			{
				if (n % 2 == 0)
				{
					n = n/2;
					//to test System.out.print (n + " ");
					count ++;
				}
				else if ((n - 1) % 2 == 0)
				{
					n = (3 * n + 1);
					//to test System.out.print (n + " ");
					count++;
				}
			}
			//System.out.println ();
			if (count > longCount)
			{	
				//assign count as longest count and original number as the longest if the count is longer than previous
				longCount = count;
				longest = origNum;
			}
			//if you want the largest number with longest count
			/*else if (count == longCount)
			{
				longCount = count;
				longest = origNum;
			}
			*/
		}
		//output longest
		System.out.println ("The number " + longest + " has the longest cycle length of " + longCount);
	}

}
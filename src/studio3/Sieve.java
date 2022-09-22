package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("how many numbers?");
		int n = in.nextInt();
		int[] numbers = new int[n];
		boolean check[] = new boolean[n];
	
		for(int i=1; i < n; i++)
			{
				numbers[i] = i;
				check[i-1] = true;
				
			}
		for (int outside = 2; outside < numbers.length; outside++)
		{
		    	if (check[outside] == true)
	    		{
		    		for (double inside = Math.pow(outside, 2); inside < numbers.length; inside = inside + outside)
					    {
			    			
		    				check[(int)inside] = false;
					    }
			         
	    		}
		
		}
			
		for(int print =0; print < check.length; print++)
			{ 
				if(check[print] == true)
				{
					System.out.println(numbers[print]);
				}
					
			}
		}
	}



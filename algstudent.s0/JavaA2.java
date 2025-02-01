package main;

import java.util.ArrayList;
import java.util.List;

public class JavaA2 {

	public static void main(String[] args){
		int n = 10000;
		
		for(int i= 0; i<7; i++) {
		    long t1 = System.currentTimeMillis();
		    List<Integer> primes = listadoPrimos(n);
	    	long t2 = System.currentTimeMillis();
	    	System.out.println("n = "+ n + " *** "+ "time = "+ (t2-t1) + " milliseconds.");
	        n *= 2;
		}
	}
		
		/**
		 * Calculates and returns all primes up to n.
		 */
		public static List<Integer> listadoPrimos(int n){
			List<Integer> primes = new ArrayList<Integer>();
			
			for(int i=2; i<=n; i++) 
			{
				if(primoA2(i)) 
				{
					primes.add(i);
				}
			}
			return primes;
		}
		
		/**
		 * Returns whether m is prime or not.
		 * @param m
		 * @return
		 */
		public static boolean primoA2(int m) {
			for(int i=2; i<m; i++)
			{
		        if (m % i == 0)
		        {
		        	return false;
		        }
			}
			return true;

		}
		 
	
}

package com.prime;

public class PrimeNumber {
	
	static void printPrime(int n) {
		if(n>=2 && n<=100)
		{
			
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Invalid number");
		}
	}
	public static void main(String[] args) {
		printPrime(90);

	}

}

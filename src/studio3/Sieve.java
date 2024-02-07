package studio3;

import java.util.Random;
import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Enter the number n: ");
		int n = scanner.nextInt();

		boolean[] isPrime = new boolean[n + 1];
		for (int i = 2; i <= n; i++)
			isPrime[i] = true;
	    for (int i = 2; i * i <= n; i++)
	            if (isPrime[i]) 
	                for (int j = i * i; j <= n; j += i)
	                    isPrime[j] = false;
System.out.println("Prime numbers up to " + n + ":");
for (int i = 2; i <= n; i++) 
	if (isPrime[i]) {
	    System.out.println(i);
	    }
		}

	}


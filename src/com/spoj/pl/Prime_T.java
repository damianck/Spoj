package com.spoj.pl;

import java.util.Scanner;

/**
 * 
 * @author Damian Wtorek
 * @see <a href=
 *      "http://pl.spoj.com/problems/PRIME_T/">http://pl.spoj.com/problems/PRIME_T/</a>
 * 
 */
public class Prime_T {

	public static String isPrime(int k) {
		if (k == 2) {
			return "TAK";
		}
		if (k % 2 == 0 || k == 1) {
			return "NIE";
		}
		for (int i = 3; i * i <= k; i += 2) {
			if (k % i == 0) {
				return "NIE";
			}
		}
		return "TAK";
	}

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int x = k.nextInt();
		for (int i = x; i > 0; i--) {
			x = k.nextInt();
			System.out.println(isPrime(x));
		}
		k.close();
	}

}

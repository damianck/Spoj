package com.spoj.pl;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author Damian Wtorek
 * @see <a href=
 *      "http://pl.spoj.com/problems/PRIME_T/">http://pl.spoj.com/problems/PRIME_T/</a>
 * 
 */

public class Prime_T2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		BigInteger value;
		int x = k.nextInt();
		for (int i = x; i > 0; i--) {
			value = BigInteger.valueOf(k.nextInt());
			if (value.isProbablePrime(1)) {
				System.out.println("TAK");
			} else
				System.out.println("NIE");
		}
		
		k.close();
	}

}

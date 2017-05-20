package com.spoj.pl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 
 * @author Damian Wtorek
 * @see <a href=
 *      "http://pl.spoj.com/problems/PRIME_T/">http://pl.spoj.com/problems/PRIME_T/</a>
 * 
 */

public class Prime_T3 {

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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int i = Integer.valueOf(br.readLine()); i > 0; i--) {
			out.println(isPrime(Integer.valueOf(br.readLine())));
			out.flush();
		}
		br.close();
		out.close();
	}
}

package Repeated_String;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		char arr[] = s.toCharArray();
		int appearencrOfChar = 0;
		long counterofA = 0;
		for (char c : arr) {
			if (c == 'a')
				appearencrOfChar++;
		}
		if (s.length() == 1 && s.charAt(0) == 'a') {
			return n;
		} else if (s.length() > 100) {
			return 0;
		}
		if (n <= 1000000000000l) {
			int length = s.length();

			long reminder = n % length;
			counterofA = n / length * appearencrOfChar;
			String ourString = s.substring(0, (int) reminder);
			for (char c : ourString.toCharArray()) {
				if (c == 'a')
					counterofA++;
			}
			// System.out.println(ourString);
			return counterofA++;
		} else if (s.equals("a"))
			return n;
		else
			return 0;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		String s = scanner.nextLine();
//
//		long n = scanner.nextLong();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		long result = repeatedString(s, n);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
//
//		scanner.close();

		System.out.println(repeatedString(
				"epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq",
				549382313570l));
	}
}

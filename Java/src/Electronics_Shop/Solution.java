package Electronics_Shop;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	/*
	 * Complete the getMoneySpent function below.
	 */
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		for (int i = 0; i < keyboards.length; i++) {
				if(keyboards[i]<1&&keyboards[i]>1000000) {
					return 0;
				}
			}
		for (int i = 0; i < drives.length; i++) {
			if(drives[i]<1&&drives[i]>1000000) {
				return 0;
			}
		}
		if (b <= 1000000 && b >= 1) {
			if(keyboards.length<=1000&&keyboards.length>=1&&drives.length>=1&&drives.length<=1000) {
			int maxSpent = 0;
			int maxArr[];
			int smallArr[];
			if (keyboards.length > drives.length) {
				maxArr = keyboards;
				smallArr = drives;
			} else {
				maxArr = drives;
				smallArr = keyboards;
			}
			for (int i = 0; i < maxArr.length; i++) {
				for (int x = 0; x < smallArr.length; x++) {
					if ((maxArr[i] + smallArr[x]) > maxSpent && (maxArr[i] + smallArr[x]) <= b) {
						maxSpent = (maxArr[i] + smallArr[x]);
						System.out.println(maxSpent);
					}
				}
			}
			if (maxSpent == 0)
				return -1;
			return maxSpent;
		}
		}
		return 0;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		String[] bnm = scanner.nextLine().split(" ");
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

//		int b = Integer.parseInt(bnm[0]);
//
//		int n = Integer.parseInt(bnm[1]);
//
//		int m = Integer.parseInt(bnm[2]);

//		int[] keyboards = new int[n];
		int[] keyboards = new int[] { 5 };

//		String[] keyboardsItems = scanner.nextLine().split(" ");
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//		for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
//			int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
//			keyboards[keyboardsItr] = keyboardsItem;
//		}

//		int[] drives = new int[m];
		int[] drives = new int[] { 4 };

		/*
		 * String[] drivesItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
		 * 
		 * for (int drivesItr = 0; drivesItr < m; drivesItr++) { int drivesItem =
		 * Integer.parseInt(drivesItems[drivesItr]); drives[drivesItr] = drivesItem; }
		 */

		/*
		 * The maximum amount of money she can spend on a keyboard and USB drive, or -1
		 * if she can't purchase both items
		 */

		int moneySpent = getMoneySpent(keyboards, drives, 5);

		/*
		 * bufferedWriter.write(String.valueOf(moneySpent)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */
		System.out.println(moneySpent);
		scanner.close();
	}
}

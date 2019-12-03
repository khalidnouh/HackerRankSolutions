package Designer_PDF_Viewer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
	// Complete the designerPdfViewer function below.
	static int designerPdfViewer(int[] h, String word) {
		if (word.length() > 10) {
			return 0;
		}
		for (int i = 0; i < h.length; i++) {
			if (h[i] > 7 || h[i] < 1)
				return 0;
		}

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] ourChar = word.toLowerCase().toCharArray();
		int maxHeight = 0;
		for (int i = 0; i < ourChar.length; i++) {
			for (int x = 0; x < alphabet.length; x++) {
				if (ourChar[i] == alphabet[x]) {
					if (maxHeight < h[x])
						maxHeight = h[x];
					//System.out.println(h[i] + " max:" + maxHeight);
					break;
				}
			}

		}
		return maxHeight * word.length();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bufferedWriter = new BufferedWriter(new
		 * FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int[] h = new int[26];
		 * 
		 * String[] hItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int i = 0; i < 26; i++) { int hItem = Integer.parseInt(hItems[i]); h[i]
		 * = hItem; }
		 * 
		 * String word = scanner.nextLine();
		 */
//		int result = designerPdfViewer(
//				new int[] {1, 3, 1, 3, 1, 4, 1, 3, 2 ,5 ,5, 5, 5, 5, 5, 5 ,5 ,5 ,5 ,5 ,5,5, 5 ,5, 5, 5
//
//
//				}, "abc");
		int result = designerPdfViewer(
				new int[] {1 ,3, 1, 3, 1, 4, 1, 3 ,2 ,5, 5 ,5 ,5, 5, 5, 5, 5, 5 ,5 ,5 ,5, 5, 5, 5, 5, 7


				}, "zaba");
		System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */
		scanner.close();
	}
}

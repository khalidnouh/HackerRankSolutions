package Cats_and_a_Mouse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
	// Complete the catAndMouse function below.
	static String catAndMouse(int x, int y, int z) {
		if(x>=1&&x<=100&&y>=1&&y<=100&&z>=1&&z<=100) {
		int distForCatA = Math.abs(z - x);
		int distForCatB = Math.abs(z - y);
		if (distForCatA == distForCatB) {
			return "Mouse C";
		}

		if (distForCatA < distForCatB) {
			return "Cat A";
		} else if (distForCatA > distForCatB) {
			return "Cat B";
		}
		}
		return null;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bufferedWriter = new BufferedWriter(new
		 * FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int q = scanner.nextInt(); scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int qItr = 0; qItr < q; qItr++) { String[] xyz =
		 * scanner.nextLine().split(" ");
		 * 
		 * int x = Integer.parseInt(xyz[0]);
		 * 
		 * int y = Integer.parseInt(xyz[1]);
		 * 
		 * int z = Integer.parseInt(xyz[2]);
		 * 
		 * String result = catAndMouse(x, y, z);
		 * 
		 * bufferedWriter.write(result); bufferedWriter.newLine(); }
		 * 
		 * bufferedWriter.close();
		 * 
		 * scanner.close();
		 */
		String result = catAndMouse(1, 2, 3);
		System.out.println(result);
	}
}

package Time_Conversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
*
* @author Khalid.nouh
*/
public class Solution {
	static String timeConversion(String s) {
		// 07:05:45PM
		int hours = Integer.parseInt(s.substring(0, 2));
		int minutes = Integer.parseInt(s.substring(3, 5));
		int seconds = Integer.parseInt(s.substring(6, 8));
		String amOrPm = s.substring(8, 10);

		hours += (amOrPm.equals("PM") && hours != 12) ? 12 : 0;
		hours -= (amOrPm.equals("AM") && hours == 12) ? 12 : 0;

		return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":"
				+ String.format("%02d", seconds);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scan.nextLine();

		String result = timeConversion(s);
		System.out.println(result);

		bw.write(result);
		bw.newLine();

		bw.close();

	}
}

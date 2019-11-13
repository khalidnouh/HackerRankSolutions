/**
*
* @CopyRights by Khalid.nouh
* 
*/
package JavaRegex2_DuplicateWords;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Khalid.nouh
 */
public class Solution {
	public static void main(String[] args) {

		String regex = "\\b(\\w+)(\\s+\\1\\b)+";
		/*
		 * 
		 * What all that means:
		 * 
		 *1- \b: look for word boundary (match only beginning of word instead of somewhere
		 * 		in the middle); 
		 * 2-(\w+): match one ore more word characters and remember them
		 * 		as a group to which later we can refer to using a number; so
		 * 		this matches a complete word and remembers it;
		 * 3- \s+: match one or more space characters; 
		 * 4- \1: match the word remembered in step 2; 
		 * 5- \b: like in step 1 – make sure it’s not a part of some longer word;
		 * 6- (\s+\1\b)+: match one or more
		 * 		occurrences of the word captured in step 2.
		 */
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0) {
			String input = in.nextLine();

			Matcher m = p.matcher(input);

			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				input = input.replaceAll(m.group(), m.group(1));
			}

			// Prints the modified sentence.
			System.out.println(input);
		}

		in.close();
	}

}

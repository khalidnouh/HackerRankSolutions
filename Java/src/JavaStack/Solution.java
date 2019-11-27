/**
*
* @CopyRights by Khalid.nouh
*  
*/
package JavaStack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Khalid.nouh
 */

public class Solution {
	
	private static boolean isBalancedString(String input) {
		Stack<Character> myStack = new Stack<Character>();
		for (char ch : input.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				myStack.push(ch);
			}
			if (ch == ')' || ch == ']' || ch == '}') {
				if (myStack.empty()) {
					return false;
				}
				if (ch == ')') {
					if (myStack.peek() == '(') {
						myStack.pop();
					} else {
						return false;
					}
				}
				if (ch == ']') {
					if (myStack.peek() == '[') {
						myStack.pop();
					} else {
						return false;
					}
				}
				if (ch == '}') {
					if (myStack.peek() == '{') {
						myStack.pop();
					} else {
						return false;
					}
				}
			}
		}
		return myStack.empty();
	}
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(Solution.isBalancedString(input));
		}
	}
}
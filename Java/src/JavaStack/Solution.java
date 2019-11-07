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
	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		boolean isBalanced = true;
		Stack<Character> myStack = new Stack<>();
		while (sc.hasNext()) {		
			myStack=new Stack<>();
			String input = sc.next();
			 if((input == null) || (input.trim().isEmpty())) {
				 System.err.println("emp");
			 }

			char[] values = input.toCharArray();
			for (char c : values) {
				if (c == '(' || c == '[' || c == '{') {
					myStack.push(c);
				}					
			else if(myStack.size()>=1){
					if (c == '}') {
						c = '{';
						if (myStack.peek() == c) {
							myStack.pop();
						}
					} else if (c == ')') {
						c = '(';
						if (myStack.peek() == c) {
							myStack.pop();
						}
					} else if (c == ']') {
						c = '[';
						if (myStack.peek() == c) {
							myStack.pop();
						}
					}
				}
						
			}
			if (myStack.isEmpty())
				isBalanced = true;
			else
				isBalanced = false;
			System.out.println(isBalanced ? true : false);
	
		}

	}
}
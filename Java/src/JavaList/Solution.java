/**
*
* @CopyRights by Khalid.nouh
* 
*/
package JavaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Khalid.nouh
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		if (numberOfElements >= 1 && numberOfElements <= 4000) {
			List<Integer> list = new ArrayList<Integer>(numberOfElements);
			for (int i = 0; i < numberOfElements; i++) {
				list.add(sc.nextInt());
			}
			int numberOfOperations = sc.nextInt();
			if (numberOfOperations >= 1 && numberOfOperations <= 4000) {
				for (int i = 0; i < numberOfOperations; i++) {

					String op = sc.next();
					if (op.equals("Insert")) {
						list.add(sc.nextInt(), sc.nextInt());
					} else if (op.equals("Delete")) {
						list.remove(sc.nextInt());
					}
				}
				for (int i : list) {
					System.out.print(i + " ");
				}
			}
		}

	}
}

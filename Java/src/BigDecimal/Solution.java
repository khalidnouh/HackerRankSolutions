/**
*
* @CopyRights by Khalid.nouh
* 
* 
*/
package BigDecimal;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
*
* @author Khalid.nouh
*/
public class Solution {
	 public static void main(String[] args) {
	        //Input
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String[] s = new String[n + 2];
	        for (int i = 0; i < n; i++) {
	            s[i] = sc.next();
	        }
	        sc.close();
	        /*
	         We want to sort in descending order while preserving the contents 
	         of each String, 
	         A comparator can achieve this for us*/
	        Comparator<String> customeComparator = new Comparator<String>() {
	            @Override
	            public int compare(String o1, String o2) {
	                BigDecimal big1 = new BigDecimal(o1);
	                BigDecimal big2 = new BigDecimal(o2);
	                return big2.compareTo(big1);
	            }
	        };
	        Arrays.sort(s, 0, n, customeComparator);
	        //Output
	        for (int i = 0; i < n; i++) {
	            System.out.println(s[i]);
	        }
	    }
	}

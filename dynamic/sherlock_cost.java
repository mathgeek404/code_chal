import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlock_cost {
    
    static int[][] dict;

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String input = a.next();
        int test_cases = new Integer(input);
        
        for (int iter=0; iter< test_cases; iter++) {
            int len = new Integer(a.next());
            
	    //String[] B_str = a.next().split("[ ]+");
            //int[] B = new int[B_str.length];
	    int[] B =  new int[len];
            for (int j=0; j < len; j++) {
                B[j] = new Integer(a.next());
            }
	    // System.out.println(Arrays.asList(B));
            
            dict = new int[B.length][2];
            dict[0][0] = 0;
            dict[0][1] = 0;
            for (int i=1; i<B.length; i++) {
                dict[i][0] = Math.max(dict[i-1][0],dict[i-1][1]+Math.abs(B[i-1]-1));
                dict[i][1] = Math.max(dict[i-1][0]+Math.abs(1-B[i]),dict[i-1][1]+Math.abs(B[i-1]-B[i]));
		//System.out.println(dict[i][0]);
		//System.out.println(dict[i][1]);
            }
            System.out.println(Math.max(dict[B.length-1][0], dict[B.length-1][1]));
            
        }
       
    }
}
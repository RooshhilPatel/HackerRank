import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long [] nums = new long[]{a, b, c, d, e};
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i=0; i<5; i++) {
            if (nums[i] < min){
                min = nums[i];
            }
            
            if (nums[i] > max){
                max = nums[i];
            }
            
            sum += nums[i];
        }
        
        System.out.println((sum-max)+" "+(sum - min));
    }
        
    
}

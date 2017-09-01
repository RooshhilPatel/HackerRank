import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int[] splitDigits(int num){
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (num > 0) {
            stack.push( num % 10 );
            num = num / 10;
        }
        int[] digitsArr = new int[stack.size()];
        int index = 0;

        while (!stack.isEmpty()) {
            digitsArr[index] = stack.pop();
            index++;
        }
        return digitsArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] nums = new int[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            nums[a0] = n;
        }
        ArrayList<Integer> counts = new ArrayList<Integer>();
        for(int i = 0; i< nums.length; i++){
            int[] digs = splitDigits(nums[i]);
            int counter = 0;
            for(int j = 0; j < digs.length; j++){
                if(digs[j] == 0){
                    continue;
                }
                if(nums[i]%digs[j] == 0){
                    counter++;
                }
            }
            counts.add(counter);
        }
        for(int i =0; i<counts.size();i++){
            System.out.println(counts.get(i));
        }
    }
}

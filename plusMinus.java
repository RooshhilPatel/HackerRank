import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double pos = 0;
        double neg = 0;
        double zero = 0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] < 0){
                neg++;
            }else if(arr[arr_i] > 0){
                pos++;
            }else{
                zero++;
            }
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);
    }
}

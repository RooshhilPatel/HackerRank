import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        
        int a0 = in.nextInt();
        arr1[0] = a0;
        int a1 = in.nextInt();
        arr1[1] = a1;
        int a2 = in.nextInt();
        arr1[2] = a2;
        int b0 = in.nextInt();
        arr2[0] = b0;
        int b1 = in.nextInt();
        arr2[1] = b1;
        int b2 = in.nextInt();
        arr2[2] = b2;
        
        int al = 0;
        int bo = 0;
        
        for(int i = 0; i < 3; i++){
            if(arr1[i] > arr2[i]){
                al++;
            }else if(arr1[i] < arr2[i]){
                bo++;
            }
        }
        
        System.out.print(al + " " + bo);
        
    }
}

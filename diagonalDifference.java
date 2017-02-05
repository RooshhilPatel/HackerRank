import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int diff = 0;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        diff = Math.abs(primaryDiagonal(a, n) - secondaryDiagonal(a,n));
        System.out.print(diff);
    }
    
    public static int primaryDiagonal(int[][] a, int n){
        int sum = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                if(a_i == a_j){
                    sum += a[a_i][a_j];
                }
            }
        }
        return sum;
    }
    
    public static int secondaryDiagonal(int[][] a, int n){
        int sum = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                if((a_j+1 + a_i) == n){
                    sum += a[a_i][a_j];
                }
            }
        }
        return sum;
    }
}

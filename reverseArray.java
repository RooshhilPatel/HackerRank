import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Scanner in1 = new Scanner(in.nextLine());
        int nextNum = 0;
        int j = n-1;
        int [] ans = new int[n];
        for(int i = 0; i < ans.length; i++){
            ans[i] = in1.nextInt();
        }
        while(j > -1){
            System.out.print(ans[j] + " ");
            j--;
        }
    }
}

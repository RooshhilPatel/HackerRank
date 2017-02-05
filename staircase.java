import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int j = n;
        int i = 0;
        int space = 0;
        int sum = 0;
        while(j != 0){
            space = j-1;
            sum = space;
            while(space != 0){
                System.out.print(" ");
                space--;
            }
            while(i + sum != n){
                System.out.print("#");
                i++;
            }
            j--;
            i = 0;
            System.out.println();
        }
    }
}

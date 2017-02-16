import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int numOfSocks = 0;
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            numOfSocks = (in.nextInt())*2;
            if(numOfSocks % 2 == 0){
                System.out.println(numOfSocks/2 + 1);
            }else{
                System.out.println(numOfSocks/2 + 2);
            }
        }
        
    }
}

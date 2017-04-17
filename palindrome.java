import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(checkPalindrome(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
    public static boolean checkPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1){
            return true;
        } else {
            if (str.charAt(0) != str.charAt(str.length() - 1)){
                return false;
            } else {
                return checkPalindrome(str.substring(1, str.length()-1));
            }
        }
    }
}

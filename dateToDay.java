import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);
        int yyyy = Integer.parseInt(year);
        
        Calendar cal = Calendar.getInstance();
        cal.set(yyyy, mm-1, dd);
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
        String text = formatter.format(cal.getTime());
        System.out.println(text.toUpperCase());
    }
}

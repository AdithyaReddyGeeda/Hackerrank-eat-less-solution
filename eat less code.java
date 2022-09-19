import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] calories = new Integer[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }

        in.close();
        Arrays.sort(calories, Collections.reverseOrder());

        long miles = 0;
        for(int i = 0; i < n; i++){

        miles += (Math.pow(2, i) * calories[i]);
        }

        System.out.println(miles);
    }
}

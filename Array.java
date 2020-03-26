import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Array
{   
    static int reverseResult(int result)
    {
        int rev_num = 0;
        while (result > 0)
        {
            rev_num = rev_num * 10 + result % 10;
            result = result / 10;
        }
        return rev_num;
    }
    
    public static void main (String[] args)
    {
        int m;
        int num = 0;
        int overallSum = 0;
        int result = 0;
        
        Scanner s = new Scanner(System.in);
        
        while (true) {
        System.out.print("Please enter a number to be added: ");
        num = s.nextInt();
      
        System.out.print("Please enter the number of integers in your array: ");
        m = s.nextInt();
            
        if (m > 0) {
        int a[] = new int[m];
        System.out.println("Please enter all of your positive numbers, one at a time: ");
        for(int i = 0; i < m; i++)
        {
            a[i] = s.nextInt();
            while (a[i] < 0) {
                System.out.println("Please enter a positive number: ");
                a[i] = s.nextInt();
            }
        }
        for(int i = a.length - 1; i >= 0; i--) {
            result = 10*result + a[i];
            overallSum = reverseResult(result) + num;
        } 
            
        String answer = Integer.toString(overallSum);
        int[] newOverallSum = new int[answer.length()];
        for (int i = 0; i < answer.length(); i++)
          {
             newOverallSum[i] = answer.charAt(i) - '0';
          }
            
          System.out.println("Output: " + Arrays.toString(newOverallSum));
          break;
    }
    else if (m < 0) {
        System.out.println("Please enter a number greater than 0.");
    }
}
}
}

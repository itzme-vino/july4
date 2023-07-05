
import java.io.*;
import java.util.*;

public class validtriangle11 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        if (A+B+C==180)
        {
            System.out.println("1");
        }
        else
        {
           System.out.println("0"); 
        }
        
    }
}
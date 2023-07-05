
import java.io.*;
import java.util.*;
import java.lang.*;

public class floor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        double C=Math.floor(A/B);
        System.out.println(Math.round(C));
        
    }
}
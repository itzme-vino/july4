
import java.io.*;
import java.util.*;

public class maxofthree4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        if((A>B)&&(A>C))
        {
            System.out.println(A);
        }
        else if((B>A)&&(B>C))
        {
            System.out.println(B);
        }
        else
        {
            System.out.println(C);
        }
    }
}
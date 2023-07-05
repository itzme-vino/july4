import java.io.*;
import java.util.*;

public class whichtriangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        if((A==B)&&(A==C))
        {
            System.out.println("equilateral");
        }
        else if((A==B)||(B==C)||(A==C))
        {
            System.out.println("isosceles");
        }
        else
        {
            System.out.println("scalene");
        }
        
    }
}
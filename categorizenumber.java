import java.io.*;
import java.util.*;

public class categorizenumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        if((A%5)==0 && (A%11)==0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
    


import java.io.*;
import java.util.*;

public class Grade2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();
        int E = s.nextInt();
        double pa = (A+B+C+D+E)*100;
        double p = pa/500;
        if(p>=90)
        {
             System.out.println(Math.round(p));
             System.out.println("A");
        }
        else if ((p>=80)&&(p<90))
        {
          System.out.println(Math.round(p));
             System.out.println("B");
        }
        else if((p>=70)&&(p<80))
        {
            System.out.println(Math.round(p));
             System.out.println("C");
        }
        else if((p>=60)&&(p<70))
        {
           System.out.println(Math.round(p));
             System.out.println("D");
        }
        else if((p>=40)&&(p<60))
        {
           System.out.println(Math.round(p));
            System.out.println("E");
        }
        else
        {
            System.out.println(Math.round(p));
            System.out.println("F");
        }

    }
}
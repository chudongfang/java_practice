import java.util.*;
import java.math.*;

/**
 * Created by cdf on 17-7-15.
 */


public class Main {
    public static long gcd(long p,long q)
    {
        return q!=0?(gcd(q,p%q)):p;
    }
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        for(int k = 0 ;k < n; k++)
        {

            String ss = in.next();
            String [] split = ss.split("/");
            long a = Long.parseLong(split[0]);
            long b = Long.parseLong(split[1]);
            long tmp = gcd(a,b);
            a /= tmp;
            b /= tmp;

            ss = in.next();
            split = ss.split("/");
            long a1 = Long.parseLong(split[0]);
            long b1 = Long.parseLong(split[1]);
            tmp = gcd(a1,b1);
            a1/=tmp;
            b1/=tmp;


            long re1 = a/gcd(a,a1)*a1;
            long re2 =gcd(b,b1);
            tmp =  gcd(re1,re2);
            re1 /= tmp;
            re2 /= tmp;

            if(re2==1)
            {
                System.out.println(re1);
            }
            else
            {
                System.out.print(re1);
                System.out.print("/");
                System.out.println(re2);
            }
        }
    }

}

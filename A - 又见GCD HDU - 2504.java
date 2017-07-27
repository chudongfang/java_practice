import java.util.*;
import java.math.*;

/**
 * Created by cdf on 17-7-15.
 */


public class Main {
    public static int gcd(int p,int q)
    {
        return q==0?p:gcd(q,p%q);
    }
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        for(int k=0;k<n;k++)
        {
            int a  = in.nextInt();
            int b  = in.nextInt();
            a/=b;
            for(int i=2;i<1000000;i++)
            {
                if(gcd(i,a)==1)
                {
                    System.out.println(i*b);
                    break;
                }
            }
        }


    }

}




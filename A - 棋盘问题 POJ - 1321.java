
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt())
        {
            int [] a = new int [100];
            int n = in.nextInt();
            int x = in.nextInt();
            for(int i=1;i<=n;i++)
            {
                a[i] = in.nextInt();
            }
            long re1 = 0;
            long t = 1;
            for(int i=n;i>=1;i--)
            {

                re1+=t*a[i];
                t*=x;
            }
            int m = in.nextInt();
            int y = in.nextInt();
            for(int i=1;i<=m;i++)
            {
                a[i] = in.nextInt();
            }
            long re2 = 0;
            t = 1;
            for(int i=m;i>=1;i--)
            {
                re2+=t*a[i];
                t*=y;
            }
            if(re1==re2)
            {
                System.out.println("=");
            }
            else if(re1>re2)
            {
                System.out.println(">");
            }
            else
            {
                System.out.println("<");
            }
        }
    }
}
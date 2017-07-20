import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
import java.math.*;

/**
 * Created by cdf on 17-7-15.
 */


public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int [] a = new int [100000];
        while(in.hasNext())
        {
            int n = in.nextInt();
            int re = 1;
            for(int i=0;i<n;i++)
            {
                a[i] = in.nextInt();
            }
            re = a[0];
            for(int i=1;i<n;i++)
            {
                re = re/getGcd(re,a[i])  * a[i]/getGcd(re,a[i]) *getGcd(re,a[i]);
            }
            System.out.println(re);
        }
    }


    /**
     * author
     * @param i first integer
     * @param j second integer
     * @return greatest common divisor
     */
    public static int getGcd(int i, int j) {
        int k;
        while ((k=i%j) != 0) {
            i = j;
            j = k;
        }
        return j;
    }
}
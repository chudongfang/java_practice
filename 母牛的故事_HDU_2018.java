import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

/**
 * Created by cdf on 17-7-15.
 */


public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int [] a = new int [100];
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        for(int i=4;i<=60;i++)
        {
            a[i] = a[i-1] + a[i-3];
        }
        while(in.hasNext())
        {
            int n = in.nextInt();
            if(n==0) break;
            System.out.println(a[n]);
        }
    }
}

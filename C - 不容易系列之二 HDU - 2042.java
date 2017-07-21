import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.reflect.Array;
import java.text.*;
import java.util.*;
import java.math.*;

/**
 * Created by cdf on 17-7-15.
 */



public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int [] a = new int[50];
        a[0] = 3;
        for(int i=1;i<31;i++)
        {
            a[i] = (a[i-1]-1)*2;
        }
        while(in.hasNext())
        {
           int n = in.nextInt();
           for(int i = 0;i < n;i++)
           {
               System.out.println(a[in.nextInt()]);
           }
        }
    }
}






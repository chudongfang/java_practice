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
        int c=   in.nextInt();
        int v =  in.nextInt();
        int v1 = in.nextInt();
        int a =  in.nextInt();
        int l =  in.nextInt();
        int re = 0;
        while(true)
        {
            re ++;
            c -= v;
            if(c<=0)
                break;
            c += l;

            if(v+a<=v1)
                v += a;
            else
            {
                v = v1;
            }
        }
        System.out.println(re);
    }
}





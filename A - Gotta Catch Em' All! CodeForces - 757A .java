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
        int bb = 0;
        int b = 0;
        int u = 0;
        int l = 0;
        int a = 0;
        int r = 0;
        int s = 0;
        String ss = in.nextLine();
        for(int i=0;i<ss.length();i++)
        {
            if(ss.charAt(i)=='B')
            {
                bb++;
            }
            else if(ss.charAt(i) == 'b')
            {
                b++;
            }
            else if(ss.charAt(i)=='u')
            {
                u++;
            }
            else if(ss.charAt(i)=='l')
            {
                l++;
            }
            else if(ss.charAt(i)=='a')
            {
                a++;
            }
            else if(ss.charAt(i)=='r')
            {
                r++;
            }
            else if(ss.charAt(i)=='s')
            {
                s++;
            }
        }
        a /= 2;
        u /= 2;
        int minn =  1000000000;
        if(a<minn)
        {
            minn = a;
        }
        if(u<minn)
        {
            minn = u;
        }
        if(b<minn)
        {
            minn = b;
        }
        if(bb<minn)
        {
            minn = bb;
        }
        if(l<minn)
        {
            minn = l;
        }
        if(r<minn)
        {
            minn = r;
        }
        if(s<minn)
        {
            minn = s;
        }
        System.out.println(minn);
    }
}




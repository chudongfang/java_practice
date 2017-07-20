import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.reflect.Array;
import java.util.*;
import java.math.*;

/**
 * Created by cdf on 17-7-15.
 */



public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        while(in.hasNext())
        {
            int n = in.nextInt();
            in.nextLine();
            for(int k=0;k<n;k++)
            {
                String s = in.nextLine();

                char [] a = s.toCharArray();
                int st = 0;
                int en = 0;
                while(st<a.length)
                {
                    if(a[st]==' ')
                    {
                        st++;
                        System.out.print(" ");
                    }
                    else
                    {
                        en = st;
                        while(a[en]!=' ' && (a.length-1)!=en) en++;
                        if(a[en]==' ')
                            en--;
                        for(int i = en;i>=st;i--)
                        {
                            System.out.print(a[i]);
                        }
                        if(en == (a.length-1))
                            break;
                        st = en+1;
                    }
                }
                System.out.println();
            }

        }
    }

}
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
        while(in.hasNext())
        {
            double sum = 0 ;
            int n = in.nextInt();
            in.nextLine();
            for(int k=0;k<n;k++)
            {
                String s = in.nextLine();
                char [] a = s.toCharArray();
                boolean fla = false;
                for(int i=0,j=a.length-1;i<j;i++,j--)
                {
                    if(a[i]!=a[j])
                    {
                        fla = true;
                    }
                }
                if(fla)
                {
                    System.out.println("no");
                }
                else
                {
                    System.out.println("yes");
                }
            }
        }
    }

}
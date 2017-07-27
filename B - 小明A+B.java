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
           int n = in.nextInt();
           for(int i=0; i < n; i++)
           {
                int a = in.nextInt();
                int b = in.nextInt();
                a %= 100;
                b %= 100;
                a += b;
                System.out.println(a%100);
           }
        }
    }
}


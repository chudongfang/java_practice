
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
           in.nextLine();
           for(int i=0; i < n; i++)
           {
                String s = in.nextLine();
                String ss = "6";
                for(int j =6;j<11;j++)
                {
                    ss+= s.charAt(j);
                }
                System.out.println(ss);
           }
        }
    }
}


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
            int n = 12;
            for (int i = 0; i < n; i++) {
                sum += in.nextDouble();
            }
            DecimalFormat df=new DecimalFormat("#.00");
            System.out.println("$"+df.format(sum/n));
        }
    }

}s
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
import java.math.*;

/**
 * Created by cdf on 17-7-15.
 */



public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int [] re = new int[1000];
        int num = 0;
        while(in.hasNext())
        {
            num  = 0 ;
            int flag =1;
            int n = in.nextInt();
            int m = in.nextInt();
            for(int i=n;i<=m;i++)
            {
                int a = i%10;
                int b = i/10%10;
                int c = i/100;
                if(a*a*a+b*b*b+c*c*c==i)
                {
                    flag = 0;
                    re[num++] = i;

                }
            }
            if(flag==1)
            {
                System.out.println("no");
            }
            else
            {
                for(int i=0;i<num;i++)
                {
                    System.out.print(re[i]);
                    if(i!=num-1)
                        System.out.print(" ");
                }
                System.out.println();
            }

        }
    }

}
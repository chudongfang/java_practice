import java.util.*;

/**
 * Created by cdf on 17-7-15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int [] a = new int[105];
        int n;
        double sum = 0;
        while(input.hasNext())
        {
            sum = 0;
            n = input.nextInt();
            for(int i=0;i<n;i++)
            {
                a[i] = input.nextInt();
            }
            Arrays.sort(a,0,n);

            for(int i=1;i<n-1;i++)
            {
                sum += a[i];
            }

            String re = String.format("%.2f", sum/(n-2));
            System.out.println(re);
        }
    }
}
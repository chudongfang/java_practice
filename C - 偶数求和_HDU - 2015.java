import java.util.*;

/**
 * Created by cdf on 17-7-15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int [] a = new int[105];
        for(int i=1;i<104;i++)
        {
            a[i] = i*2;
        }
        int n,m;
        while(in.hasNext())
        {
            int sum=0;
            n = in.nextInt();
            m = in.nextInt();
            int x = n/m;
            int y = n%m;
            int index =1;
            for(int i=0;i<x;i++)
            {
                sum= 0;
                for(int j=0;j<m;j++)
                {
                    sum += a[index++];
                }
                System.out.print(sum/m);
                if(!(i==x-1&&y==0))System.out.print(" ");
            }
            sum =0;
            for(int i=0;i<y;i++)
            {
                sum += a[index++];
            }
            if(y!=0) System.out.print(sum/y);
            System.out.println();
        }
    }
}

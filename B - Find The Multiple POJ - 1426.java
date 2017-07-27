import java.math.BigInteger;
import java.util.*;

public class Main {
    static boolean flag;
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt())
        {
            int n = in.nextInt();
            flag = false;
            dfs(n,1,1);

        }
    }
    public static void dfs(int n,long m,int turn)
    {
        if(turn>19) return ;
        if(flag) return ;
        if(m%n==0)
        {
            flag = true;
            System.out.println(m);
            return ;
        }
        dfs(n,m*10,turn+1);
        dfs(n,m*10+1,turn+1);

    }
}
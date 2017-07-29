import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n,m;
    static int dir[][]={{1,0},{-1,0}, {0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
    static char mm [][] = new char[105][105];
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            n = in.nextInt();
            m = in.nextInt();
            if(n==0&&m==0) break;;
            for(int i=0;i<n;i++)
            {
                String s = in.next();
                for(int j=0;j<s.length();j++)
                {
                    mm[i][j] = s.charAt(j);
                }
            }
            int re = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(mm[i][j]=='@')
                    {
                        mm[i][j] = '*';
                        re++;
                        dfs(i,j);
                    }
                }
            }
            System.out.println(re);
        }
    }
    public static void dfs(int x,int y)
    {
        for(int i=0;i<8;i++)
        {
            int xx = x+dir[i][0];
            int yy = y+dir[i][1];

            if(xx>=0&&xx<n&&yy>=0&&yy<m&&mm[xx][yy]=='@')
            {
                mm[xx][yy] = '*';
                dfs(xx,yy);
            }
        }
    }
}
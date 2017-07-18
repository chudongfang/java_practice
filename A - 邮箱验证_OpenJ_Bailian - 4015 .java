import java.util.*;

/**
 * Created by cdf on 17-7-15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        while(input.hasNext())
        {
            int f1 = 0;
            int f3 = 0;
            int x=0;
            String s =  input.nextLine();
            int begin = 0;
            while(s.charAt(begin)==' ') begin++;
            for(int i=begin;i<s.length();i++)
            {
                if(s.charAt(i)=='@')
                {
                    f1++;
                    x = i;
                }
            }

            if(f1!=1)
            {
                System.out.println("NO");
                continue;
            }

            if(s.charAt(begin)=='@'||s.charAt(s.length()-1)=='@')
            {
                System.out.println("NO");
                continue;
            }

            if(s.charAt(begin)=='.'||s.charAt(s.length()-1)=='.')
            {
                System.out.println("NO");
                continue;
            }
            if(s.charAt(x-1)=='.'||s.charAt(x+1)=='.')
            {
                System.out.println("NO");
                continue;
            }

            for(int i=x+2 ;i<s.length();i++)
            {
                if(s.charAt(i)=='.')
                {
                    f3++;
                }
            }

            if(f3==0)
            {
                System.out.println("NO");
                continue;
            }


            System.out.println("YES");

        }
    }
}

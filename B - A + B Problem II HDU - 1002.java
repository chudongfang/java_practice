import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            System.out.println("Case " + i + ":");
            if(i == n)
                System.out.print(a + " + "+ b + " = " + a.add(b));
            else
                System.out.println(a + " + " + b + " = " + a.add(b));
            System.out.println();
        }
    }
}

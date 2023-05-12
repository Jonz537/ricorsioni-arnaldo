import java.util.Set;

public class Eulero {

    public static int phi(int n) {

        int p = n, a = 1, b = 1;

        if (prime(p)) {
            return p - 1;
        } else if (n == a * b && mcd(a, b) == 1) {
            return phi(a) * phi(b);
        }


        return 1;
    }

    public static int mcd(int m, int n) {
        if(n == 0)
            return(m);
        else
            return mcd(n, m%n);
    }

    public static boolean prime(int n) {

        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 2) {
            return true;
        }

        return prime(n - 1);
    }

}

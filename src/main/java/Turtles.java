import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        //Thread.sleep(1000);
        System.out.println(gcd(384576138,234));
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toNanos();
        System.out.println("elapsed time for gcd: "+timeElapsed+" nano seconds");

        start = Instant.now();
        //Thread.sleep(1000);
        System.out.println(gcd2(384576138,234));
        end = Instant.now();
        timeElapsed = Duration.between(start, end).toNanos();
        System.out.println("elapsed time for gcd2: "+timeElapsed+" nano seconds");
    }


    // recursive implementation
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    // non-recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

//    public static void main(String[] args) {
//        int p = Integer.parseInt(args[0]);
//        int q = Integer.parseInt(args[1]);
//        int d  = gcd(p, q);
//        int d2 = gcd2(p, q);
//        StdOut.println("gcd(" + p + ", " + q + ") = " + d);
//        StdOut.println("gcd(" + p + ", " + q + ") = " + d2);
//    }
}

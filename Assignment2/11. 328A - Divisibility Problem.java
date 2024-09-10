import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();


            long rem = a % b;


            long steps = (rem == 0) ? 0 : (b - rem);

            System.out.println(steps);
        }
    }
}

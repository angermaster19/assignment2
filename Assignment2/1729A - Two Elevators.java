//package Assignment2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        for (int i = 0; i < testcases; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d1 = Math.abs(a -1);
            int d2 = Math.abs(b -c);
            int d3 = Math.abs(c - 1);
            if (d1<d2+d3){
                System.out.println(1);
            }else if (d1 == d2+d3) {
                System.out.println(3);
            }else{
                System.out.println(2);
            }

        }
    }
}

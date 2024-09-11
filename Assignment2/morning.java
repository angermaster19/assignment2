//package Logic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n = "1234567890";
        char[] chars = n.toCharArray();
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            String pincode = sc.next();
            char[] pin = pincode.toCharArray();
            int sum = 0;
            int pointer = 1;
            for (int i = 0; i < pincode.length(); i++) {
                int n1 = pin[i] -'0';
                if(n1==0)n1 = 10;
                sum+= Math.abs(n1-pointer)+1;
                pointer = n1;
            }
            System.out.println(sum);

        }
    }
}

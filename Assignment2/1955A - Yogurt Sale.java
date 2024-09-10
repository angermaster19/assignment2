//package Assignment2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases > 0) {
            int price = 0;
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(2*a<b){
                price = n*a;
            }else{
                if (n%2==0){
                    price = (n/2)*b;
                }else{
                    price = ((n-1)/2)*b + a;
                }
            }
            System.out.println(price);
            testcases--;
        }
    }
}

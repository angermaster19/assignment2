//package Assignment2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int i = 0;
        while (i < testcases) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c  = 0;
            while(a>0){
                if (c<=b){
                    c++;
                }else{
                    c--;
                }
                a--;
            }
            if (c==b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            i++;
        }
    }
}

//package Assignment2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==3 || b ==3){
            int c = a-b;
            System.out.println(Math.abs(c));
        }else{
            System.out.println(a+b);
        }
    }
}

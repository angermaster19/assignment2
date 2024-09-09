import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int place = 1;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += place*(int)Math.pow(10,rem-1);
            n = n /10;
            place++;
        }
        System.out.println(sum);
    }
}
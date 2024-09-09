import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int countDigit = countDigit(n);
        int a = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem,countDigit);
            n = n/10;
        }
        if(sum==a){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static int countDigit(int n){
        int s = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            s++;
        }
        return s;
    }
}
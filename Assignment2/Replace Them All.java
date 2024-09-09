import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long num = 0;
        long place = 1;
        if (n==0){
            System.out.println(5);
            return;
        }
        while(n>0){
            long rem = n%10;
            if (rem ==0){
                num+= 5*place;
            }else{
                num+=rem*place;
            }
            place*=10;
            n/=10;
        }
        System.out.println(num);
    }
}
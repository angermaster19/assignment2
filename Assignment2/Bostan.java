import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isBostan(n)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static boolean isBostan(int n ){
        int sumofDigit = sumofDigit(n);
        int sumofPrime = sumofPrime(n);
        return sumofDigit == sumofPrime;
    }
    public static int sumofDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sumofPrime(int n) {
        int sum = 0;

        while(n%2==0){
            sum+= sumofDigit(2);
            n/=2;
        }

        for (int i=3;i*i<=n;i+=2){
            while (n%i==0){
                sum+= sumofDigit(i);
                n/=i;
            }
        }

        if (n>2){
            sum+=sumofDigit(n);
        }
        return sum;
    }
}

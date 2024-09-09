import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        int prime = prime(n);
        if (prime==1){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
    public static int prime(int n){
        for(int i =2;i<n/2+1;i++){
            if (n%i==0){
                return 0;
            }
        }
        return 1;
    }
}
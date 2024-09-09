import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        for (int i = n1; i<=n2;i++){
            if (isArmstrom(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrom (int n){
        //Count of digit;
        int cod = cod(n);
        int num = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += (int)Math.pow(rem,cod);
            n = n/10;
        }
        if (sum ==num){
            return true;
        }
        
        return false;
    }

    public static int cod(int n){
        int c =0;
        while(n>0){
            c++;
            n = n/10;
        }
        return c;
    }
}

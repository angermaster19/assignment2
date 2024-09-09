import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int c = 0;
        while(n>0){
            int rem = n%10;
            if(rem==t){
                c++;
            }
            n = n/10;
        }
        System.out.println(c);
    }
}
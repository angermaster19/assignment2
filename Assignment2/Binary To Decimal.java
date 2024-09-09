import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = 0;
        int i = 0;
        while(n>0){
            int rem = n%10;
            num += rem*Math.pow(2,i);
            n = n/10;
            i++;
        }
        System.out.println(num);
    }
}
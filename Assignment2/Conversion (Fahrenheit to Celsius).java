import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        while(n1<=n2){
            double c = (double) (5 * (n1 - 32)) / 9;
            System.out.println(n1+" "+(int)c);
            n1+=n3;
        }
    }
}

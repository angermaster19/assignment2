import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        if (n1>n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        while(true){
            int rem = n2 % n1;
            n2 = n1;
            n1 = rem;
            if (rem ==0){
                System.out.println(n2);
                break;
            }
        }
    }
}
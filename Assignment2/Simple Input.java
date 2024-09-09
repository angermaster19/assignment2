import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(true){
            int n = scan.nextInt();
            sum+=n;
            if(sum<0){
                break;
            }
            System.out.println(n);
        }
    }
}
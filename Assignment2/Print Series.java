import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int i = 0;
        int n = 1;
        while(i<n1){
            int series = 3*n + 2;
            if (series%n2!=0){
                System.out.println(series);
                i++;
            }
            n++;

        }

    }
}
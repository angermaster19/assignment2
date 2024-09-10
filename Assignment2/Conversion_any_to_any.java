import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int n = sc.nextInt();

        // convert to decimal
        int num = n;
        int deciaml = 0;
        int i = 0;
        while(num>0){
            int rem = num%10;
            deciaml += rem*(int)Math.pow(b1,i);
            num = num/10;
            i++;
        }

        // decimal to b2
        int sum = 0;
        int mul = 1;
        while(deciaml>0){
            int r = deciaml%b2;
            sum += r *mul;
            deciaml = deciaml/b2;
            mul *= 10;
        }
        System.out.println(sum);
    }
}

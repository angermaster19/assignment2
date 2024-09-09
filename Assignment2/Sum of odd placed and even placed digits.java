import java.util.*;
public class Main {
    public static void main(String args[]) {
        int odd = 0;
        int even = 0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 1;
        while(num>0){
            int rem = num%10;
            num = num/10;
            if (i%2==0){
                even = even+rem;
            }else{
                odd = odd+rem;
            }
            i++;
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
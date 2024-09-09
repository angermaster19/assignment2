import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =0;i<n;i++){
            int n1 = scan.nextInt();
            int even = 0;
            int odd = 0;
            int place = 1;
            while(n1>0){
                int rem = n1%10;
                if (place%2==0){
                    even += rem;
                }else{
                    odd+=rem;
                }
                n1 = n1/10;
                place++;
                }
            
            if (even%4==0 || odd%3==0){
                    System.out.println("Yes");
            }else{
                    System.out.println("No");
                }
                
            
            
        }
    }
}
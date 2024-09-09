import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n) {  
    if (n == 0) return 0;  
    if (n == 1) return 1;  
    
    int n1 = 0, n2 = 1, sum = 2;  
    for (int i = 2; i < n-1; i++) {  
        int fib = n1 + n2;  
        n1 = n2;  
        n2 = fib;  
        sum += fib;  
    }  
    return sum;  
}
}

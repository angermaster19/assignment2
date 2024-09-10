import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases>0){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int Ayush_score = 0;
            int Harshit_score = 0;
            int i = 1;
            while(true){
                if(i%2!=0){
                    if (Ayush_score+i >M){
                        System.out.println("Harshit");
                        break;
                    }
                    Ayush_score+=i;
                    
                }else{
                    if (Harshit_score+i >N){
                        System.out.println("Aayush");
                        break;
                    }
                    Harshit_score+=i;
                }
                i++;
            }
            testcases--;

        }
    }
}

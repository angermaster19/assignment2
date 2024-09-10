import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        char[] chars = n.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= '5' && chars[i] <= '9') {
                if(i==0 && chars[i]=='9')continue;
                chars[i] = (char)('0'+'9' - chars[i]);
            }
        }
        String s = new String(chars);
        System.out.println(s);

    }
}

import java.util.*;

public class findGCD {
    static int getGCD(int a, int b){
        while(b != 0){
            int oldvalueofb = b;
            b = a%b;
            a = oldvalueofb;

        }
        int ans = a;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getGCD(a,b));
    }
}

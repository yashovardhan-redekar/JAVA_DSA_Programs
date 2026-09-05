import java.util.*;
public class findLCM {
    static int getGCD(int a, int b){
        while(b != 0){
            int oldvalueofb = b;
            b = a%b;
            a = oldvalueofb;
        }
        int ans =a;
        return ans;
    }

    static int getLCM(int a, int b){
        int gcd = getGCD(a,b);
        int product = a*b;
        int LCM = product /gcd;
        return LCM;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getLCM(a, b));
    }
}

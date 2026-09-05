import java.util.*;

public class PalindromeNum {
    static void ispalindrome(int num){
        int originalnum =num;
        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            rev = rev*10 + digit;
            num = num/10;
        }
        if(rev == originalnum){
            System.out.println("the number is palindrome " +originalnum);
        }
        else{
            System.out.println("number is not palindrome " +originalnum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n = sc.nextInt();
        ispalindrome(n);
    }
}

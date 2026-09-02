import java.util.*;

public class sumofdigits {
    static void sum(int num){
        int sum =0;
        while(num != 0) {
            int digit = num % 10;
            num = num/10;
            sum = sum + digit;
        }
        System.out.println("the total sum is: " + sum);
    }

    public static void main(String[] args) {
        int num = 567423;
        sum(num);
    }
}

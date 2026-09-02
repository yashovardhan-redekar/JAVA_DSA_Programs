import java.util.*;
public class printdigits {
    static void digits(int num){
    while(num != 0){
        int digit = num%10;
        System.out.println(digit);
        num = num/10;
    }
    }
    public static void main(String[] args) {
        int num = 76543;
        digits(num);
    }
}

import java.util.*;

public class armstrongNum {
    static boolean isArmstrong(int num) {
        int sum = 0;
        int original = num;
        while (num != 0) {
            int digit = num % 10;
            int cube = digit * digit * digit;
            sum = sum + cube;
            num = num / 10;
        }
        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }
}

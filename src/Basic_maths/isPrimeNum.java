import java.util.*;

public class isPrimeNum {
    static boolean isprime(int num){
        for(int i =2; i*i<= num; i++){
        //for(int i=2; i<num-1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int num = sc.nextInt();
        System.out.println(isprime(num));
    }
}

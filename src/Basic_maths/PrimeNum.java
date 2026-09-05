import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter number to check it is prime or not: ");
        int num = sc.nextInt();
        boolean isprime = true;

        if(num <= 1){
            isprime = false;
        }

        for(int i =2; i< num; i++){
            if(num % i ==0) {
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println(num+" number is prime");
        }
        else{
            System.out.println(num+" number is not prime");
        }
    }
}

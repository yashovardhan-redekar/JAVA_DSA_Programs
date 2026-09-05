package Basic_maths;

public class primenums {
    static boolean isprimeornot(int num){
        for(int i =2; i*i<= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    static void printallprimenums(int n){
        for(int num = 2; num <=n; num++){
            boolean isprime = isprimeornot(num);
            if(isprime == true){
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        int num = 100;
        printallprimenums(num);
    }
}

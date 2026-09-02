package Basic_maths;

public class countdigits {
    static void digitcount(int num){
        int count =0;
        while(num != 0){
            int digit = num %10;
            System.out.println(digit);
            count++;
            num = num/10;
        }
        System.out.println("tootal digits: "+count);
    }

    public static void main(String[] args) {
        int num = 12345;
        digitcount(num);
    }
}

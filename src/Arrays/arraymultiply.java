import java.util.*;

public class arraymultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int mul = 1;
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            mul = mul * arr[i];
        }
        System.out.println("The multiplication is: " + mul);
    }
}

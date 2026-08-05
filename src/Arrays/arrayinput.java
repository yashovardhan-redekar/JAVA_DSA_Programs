import java.util.*;

public class arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the Array Elements: ");
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
}

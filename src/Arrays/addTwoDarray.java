package Arrays;
import java.util.*;
public class addTwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3];
        int sum =0;
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
                sum = sum+arr[i][j];
            }
            System.out.println();
        }
        System.out.println("the sum is: "+sum);
    }
}

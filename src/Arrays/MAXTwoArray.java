package Arrays;
import java.util.*;

public class MAXTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3];
        int max = arr[0][0];
        System.out.println("Enter teh array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            if(arr[i][j] > max){
                max = arr[i][j];
        }
    }
            System.out.println();
        }
        System.out.println("maximum element is: "+max);
    }
}

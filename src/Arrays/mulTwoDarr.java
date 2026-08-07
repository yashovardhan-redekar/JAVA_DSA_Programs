package Arrays;
import java.util.*;

public class mulTwoDarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[2][3];
        int mul =1;
        System.out.println("enter the array elements: ");
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                mul = mul*arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication is: "+mul);
            }
    }

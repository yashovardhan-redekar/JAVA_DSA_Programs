package Arrays;
import java.util.*;

public class maxelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int max = arr[0];
        System.out.println("enter the elements in the array: ");
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: "+max);
    }
}

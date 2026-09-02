package Strings;
import java.util.*;

public class strlength {
    static int lengthofstring(String str){
        char[] arr =str.toCharArray();
        int len = arr.length;
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string: ");
        String str = sc.nextLine();
        System.out.println(lengthofstring(str));
    }
}

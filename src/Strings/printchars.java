package Strings;
import java.util.*;

public class printchars {
    static void printstring(String str){
        int n = str.length();
        for(int i =0; i< n; i++){
            char ch = str.charAt(i);
            System.out.print(" "+ch);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string: ");
        String str = sc.nextLine();
       printstring(str);

    }
}

package Strings;
import java.sql.SQLOutput;
import java.util.*;

public class reversestring {
    static String stringreverse(String str){
        String reverse ="";
        int n = str.length();
        for(int i =n-1; i >=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        System.out.println("string after reverse: "+stringreverse(str));
    }
}

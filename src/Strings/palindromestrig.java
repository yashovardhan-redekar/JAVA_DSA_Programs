package Strings;
import java.util.*;
public class palindromestrig {
    static void ispalindrome(String str) {
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        if (reverse.equals(str)) {
            System.out.println("string is palindrome: "+reverse);
        } else {
            System.out.println("string is not palindrome: "+reverse);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("enter any string: ");
            String str = sc.nextLine();
            ispalindrome(str);
            sc.close();


//    static String stringreverse(String str){
//        String reverse ="";
//        int n = str.length();
//        for(int i =n-1; i >=0; i--){
//            char ch = str.charAt(i);
//            reverse = reverse + ch;
//        }
//        return reverse;
//    }
//    static boolean ispalindrome(String str){
//        String original = str;
//        String reverse = stringreverse(original);
//        for(int i =0; i<original.length(); i++){
//         char ch1 = original.charAt(i);
//         char ch2 = reverse.charAt(i);
//         if(ch1 != ch2){
//             return false;
//         }
//        }
//        return true;
//    }
//        public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//            System.out.println("enter any string: ");
//            String str = sc.nextLine();
//            System.out.println(ispalindrome(str));
//            sc.close();

    }
}

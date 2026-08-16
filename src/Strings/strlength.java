package Strings;

public class strlength {
    static int lengthofstring(String str){
        char[] arr =str.toCharArray();
        int len = arr.length;
        return len;
    }

    public static void main(String[] args) {
        String str = "yash";
        System.out.println(lengthofstring(str));
    }
}

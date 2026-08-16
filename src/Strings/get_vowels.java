package Strings;

public class get_vowels {
    static int vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
            return count;
        }
        public static void main (String[]args){
            String str = "calesthenics";
            System.out.println(vowels(str));

        }
    }

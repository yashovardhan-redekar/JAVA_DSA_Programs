package Patterns;

public class square {
    public static void main(String args[]) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            //for each row n columns
            for (int col = 1; col <= n; col++) {
                // print star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

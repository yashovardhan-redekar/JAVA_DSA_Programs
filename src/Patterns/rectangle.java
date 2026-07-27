package Patterns;

public class rectangle {
    public static void main(String args[]){
        int n = 5;
        for(int row = 1; row <= 3; row ++){
            //for each row  n columns
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package Methods;

public class nonvoid {
    static int add(int x, int y){
        int  sum = x+y;
        return sum;
    }

    public static void main(String[] args) {
        int result = add(5,20);
        System.out.println("addition is: "+result);
    }
}

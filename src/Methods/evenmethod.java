package Methods;

public class evenmethod {
    static boolean even(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = even(5);
        System.out.println(result);
    }
}

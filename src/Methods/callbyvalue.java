package Methods;

public class callbyvalue {
    static void solve(int num){
        System.out.println("inside solve: "+num);
        num =  num *10;
        System.out.println("inside solve: "+num);
    }

    public static void main(String[] args) {
        int num =5;
        System.out.println("Inside Main: "+num);
        solve(num);
        System.out.println("Inside Main: "+num);
    }
}

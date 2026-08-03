package Methods;

public class valueupdate {
    static void updatevalue(int x){
        x=x+10;
        System.out.println("value of x inside method is: "+x);
    }

    public static void main(String[] args) {
        int x =20;
        System.out.println("before method call: "+x);
        updatevalue(x);
        System.out.println("after method call: "+x);
    }
}

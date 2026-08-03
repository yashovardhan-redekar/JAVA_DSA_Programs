package Methods;

public class overloadhw {
    static void Display(int x){
        System.out.println(x+" is this.");
    }

    static void Display(String name){
        System.out.println(name+" is this");
    }

    public static void main(String[] args) {
        Display(3);
        Display("yash");
    }
}

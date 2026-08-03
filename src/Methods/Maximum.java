package Methods;

public class Maximum {
    static void max(int x, int y){
        if(x > y){
            System.out.println(x+" is greater");
        }
        else{
            System.out.println(y+" is greater");
        }
    }

    public static void main(String[] args) {
        max(10,15);
    }
}

package Methods;

public class overloading {
    static int add(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    static int add(int a, int b, int c){
        int ans = a+b+c;
        return ans;
    }

    public static void main(String[] args) {
        int ans1 = add(10,15);
        int ans2 = add(10,15,25);
        System.out.println("answer1 : "+ans1);
        System.out.println("answer2 : "+ans2);
    }
}

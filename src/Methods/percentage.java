package Methods;

public class percentage {
    static float percent(int obtained, int total){
        float percentage = (obtained*100.0f / total);
        return percentage;
    }

    public static void main(String[] args) {
        float result = percent(457, 500);
        System.out.println("the percentage is : "+result);
    }
}

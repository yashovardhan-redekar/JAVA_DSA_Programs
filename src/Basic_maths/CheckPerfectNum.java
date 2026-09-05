package Basic_maths;

public class CheckPerfectNum {
    static boolean checkperfectnum(int num){
        int sum =1;
        for(int i =2; i*i <= num; i++){
            if(num %i == 0){
                int firstfactor = i;
                int secondfactor = num/i;
                sum = sum  + firstfactor + secondfactor;
            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkperfectnum(6));
    }
}

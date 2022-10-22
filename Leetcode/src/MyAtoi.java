import java.util.Arrays;

public class MyAtoi {
    public static void main(String[] args) {
        String s="4193 with words";
        int ans=my(s);
    }

    static int my(String s) {

        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>0&&s.charAt(i)<10){
                sum=(sum*10)+s.charAt(i);
            }
        }

        return sum;
    }
}

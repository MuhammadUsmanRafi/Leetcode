public class RunningSumof1dArray {
    public static void main(String[] args) {

        int[] num={1,2,3,4};
        int[] nums=(runningsum(num));
        System.out.println(java.util.Arrays.toString(nums));
    }

    static int[] runningsum(int[] num) {

        for (int i = 1; i < num.length; i++) {

            num[i]+=num[i-1];
        }

        return num;
    }

}

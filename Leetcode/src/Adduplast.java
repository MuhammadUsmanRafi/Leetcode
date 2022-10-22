import java.util.Arrays;

public class Adduplast {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int y = nums.length;
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x = x * 10 + nums[i];
        }
        x++;
        System.out.println(x);
        while (x > 0) {
            nums[y] = x % 10;
            x /= 10;
            y--;
        }
        System.out.println(Arrays.toString(nums));
    }
}

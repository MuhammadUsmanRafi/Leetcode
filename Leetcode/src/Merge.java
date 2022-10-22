import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int m=3;
        int n=3;
        int[] nums1=new int[m];
        nums1=new int[]{1,2,3,0,0,0};
        int[] nums2=new int[n];
        nums2=new int[]{2,5,6};

        int[] num3=new int[m+n];

            System.arraycopy(nums1, 0, num3, 0, m);
            System.arraycopy(nums2, 0, num3, m, n);

            Arrays.sort(num3);
        for (int i = 0; i < m+n; i++) {
            nums1[i]=num3[i];
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class FindMedianOfSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {3,4};
        
        double median=median(nums1,nums2);
        System.out.println(median);
    }

    static double median(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;

        int[] num3=new int[m+n];

        System.arraycopy(nums1, 0, num3, 0, m);
        System.arraycopy(nums2, 0, num3, m, n);

        Arrays.sort(num3);

        int end=num3.length;
        if (end%2==1){
            return num3[(m+n)/2];
        }

        int middle=end/2;
        double num=num3[middle-1]+num3[middle];
        return ((num/2));
    }
}

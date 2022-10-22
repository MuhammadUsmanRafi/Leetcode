import java.util.Arrays;

public class Merge2 {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[] nums1=new int[m];
        nums1=new int[]{1,2,3,0,0,0};
        int[] nums2=new int[n];
        nums2=new int[]{2,5,6};

        int[] num3=new int[n+m];

        int pos=0;

        for (int element:nums1
             ) {
            if (element==0){
                continue;
            }
            num3[pos]=element;
            pos++;
        }
        for (int element:nums2
             ) {
            if (element==0){
                continue;
            }
            num3[pos]=element;
            pos++;
        }
//
//        System.out.println(Arrays.toString(num3));
        for (int i = 0; i < m+n; i++) {
            nums1[i]=num3[i];
        }
        System.out.println(Arrays.toString(nums1));
    }
}

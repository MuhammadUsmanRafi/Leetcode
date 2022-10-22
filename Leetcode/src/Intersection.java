import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1=new int[3];
        nums1=new int[]{1,2,3,5,2,5};
        int[] nums2=new int[3];
        nums2=new int[]{2,5,6};
        ArrayList<Integer> list=new ArrayList<>(5);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                }
            }
        }
        int[] nums3=new int[list.size()];
        int index=0;
        for (int a:list
             ) {
            if (a==nums3[index]){
                continue;
            }
            nums3[index]=a;
            index++;
        }
        System.out.println(Arrays.toString(nums3));
    }
}

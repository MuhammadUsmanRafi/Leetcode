import java.util.ArrayList;
import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4,4,5};
        int target = 4;
        int[] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }


    static int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                list.add(i);
            }
        }
        if (list.size()==0){
            return new int[]{-1,-1};
        }

        if (list.size()==1){
            return new int[]{list.get(0), list.get(0)};
        }

        return new int[]{list.get(0),list.get(list.size()-1)};

    }
}

import java.util.Arrays;

public class Removeduplicate {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int k=removeDuplicates(nums);
        System.out.println(k);
    }


    static int removeDuplicates(int[] nums) {

        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

//        int k=0;
//        for (int i = nums.length-1; i >0; i--) {
//
//            if (nums[i]==nums[i-1]){
//
//                k++;
//            }
//        }



//        System.out.println(Arrays.toString(nums));
//
//        return k;
//    }

}

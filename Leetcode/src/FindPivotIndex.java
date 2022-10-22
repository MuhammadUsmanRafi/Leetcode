public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};

        int index=findpivotindex(nums);
        System.out.println(index);
    }

    static int findpivotindex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftsum = 0;
            int rightSum = 0;

            //for left sum
            if (i==0) {
                leftsum = 0;
                for (int j = nums.length - 1; j > i; j--) {
                    rightSum += nums[j];
                }
                if (leftsum == rightSum) {
                    return i;
                }
            }
            for (int j = nums.length - 1; j > i; j--) {
                rightSum += nums[j];
            }
            for (int j = i-1; j >=0 ; j--) {
                leftsum+=nums[j];
            }
            if (leftsum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}

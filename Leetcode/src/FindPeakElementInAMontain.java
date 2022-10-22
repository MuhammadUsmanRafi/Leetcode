public class FindPeakElementInAMontain {
    public static void main(String[] args) {
        int[] nums={0,10,5,2};
        int ans=peak(nums);
        System.out.println();
    }

    static int peak(int[] nums) {
        int start=0;
        int end= nums.length;

        while (start<end)
        {
            int mid=start+(end-start)/2;

            if (nums[mid]>nums[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}

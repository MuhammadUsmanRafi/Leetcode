public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,9,10,34};
        int target=5;
        int ans=number(arr,target);
        System.out.println(ans);
    }

    static int number(int[] arr, int target) {
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length;
        while (start <=  end)
        {
            int mid=start+(end-start)/2;

            if (arr[mid]<target)
            {
                start=mid+1;
            }
            if (arr[mid]>target)
            {
                end=mid-1;
            }
        }
        return arr[start];
    }
}

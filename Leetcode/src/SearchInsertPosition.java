import java.util.Arrays;
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr={-10,-5,0,5,6,7,8,9,100,500};
        int target=501;

        int ans=binary(arr,target);
        System.out.println(ans);
    }

    //binary search
    //if search return the index otherwise return -1
    static int binary(int[] arr, int target) {
        int index=Arrays.binarySearch(arr,target);
        if(index<0)
            index=(-1*index)-1;
        return index;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>=target){
//                return i;
//            }
//        }
//        int num=arr.length-1;
//        if (arr[num]<target)
//        {
//            return (num+1);
//        }
//        return -1;
    }


}

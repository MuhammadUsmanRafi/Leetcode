public class Search {
    public static void main(String[] args) {
        int[] array={4,5,6,7,0,1,2};
        int target=0;
        int ans=search1(array,target);
        System.out.println(ans);
    }

    static int search1(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==target){
                return i;
            }
        }
        return -1;
    }
}

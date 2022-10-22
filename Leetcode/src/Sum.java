import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] array={2,7,11,15};
        int target=9;
        int[] array1=sum(array,target);
        System.out.println(Arrays.toString(array1));
    }

    static int[] sum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[j]==target-array[i]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }
}

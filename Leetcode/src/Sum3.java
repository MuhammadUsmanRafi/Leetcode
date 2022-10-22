import java.util.Arrays;

public class Sum3 {
    public static void main(String[] args) {
        int[] array={-1,0,1,2,-1,-4};
        int target=0;
        int[][] array1=sum(array,target);
        System.out.println(Arrays.toString(array1));
    }

    static int[][] sum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = i+2; k < array.length; k++) {
                    if (array[i]+array[j]+array[k]==0){
                        return new int[][] {{i,j,k},{i,j,k}};
                    }
                }
            }
        }
        return new int[][] {{0,0,0},{0,0,0}};
    }
}

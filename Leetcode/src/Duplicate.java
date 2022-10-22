import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean check = dupliate(nums);
        System.out.println(check);
    }

    static boolean dupliate(int[] array) {


        Integer[] intArr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrList.add(array[i]);
        }
        System.out.println(arrList);
        for (int i = 0; i < array.length; i++) {
            if (arrList.contains(array[i])) {
                return true;
            }
        }
        return false;
    }
}




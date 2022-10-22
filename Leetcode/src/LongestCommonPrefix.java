import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        String ans=longestCommonPrefix(strs);
        System.out.println(ans);

    }

    public static String longestCommonPrefix(String[] strs) {
        String common_string="";
        Arrays.sort(strs);
        String smallest_length = strs[0];
        for (int i = 0; i < smallest_length.length(); i++) {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                common_string=common_string+strs[0].charAt(i);
            }
            else {
                break;
            }
        }
        return common_string;
    }
}

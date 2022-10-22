public class PalindromeNumber {
    public static void main(String[] args) {
        boolean chk=isPalindrome(121);
        System.out.println(chk);
    }


    public static boolean isPalindrome(int x) {
        int origional=x;
        if (x<0){
            return false;
        } else if (x==0) {
            return true;
        }
        int ans = 0;
        while(x > 0){

            int r = x%10;
            int temp = ans*10 + r;
            ans = temp;
            x = x/10;
        }
        if (origional==ans){
            return true;
        }
        return false;
    }
}

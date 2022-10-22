import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int x=in.nextInt();

        int num=reverse(x);

        System.out.println(num);
    }

//     static int reverse(int x) {
//        int ans=0;
//
//        while(x>0)
//        {
//            int rem=x%10;
//            x/=10;
//
//            ans=ans*10+rem;
//        }
//        return ans;
//    }

    static int reverse(int x){
        boolean neg = (x < 0)?true:false;
        if (x==0){
            return 0;
        }


        if(x < 0){
            x = -x;
        }
        int ans = 0;
        while(x > 0){

            int r = x%10;
            int temp = ans*10 + r;
            if((temp-r)/10 != ans){
                return 0;
            }
            ans = temp;
            x = x/10;
//              int rem=x%10;
//              x/=10;
//
//            ans=ans*10+rem;
//
        }

        if(neg){
            ans = -ans;
        }


        return ans;
    }



}

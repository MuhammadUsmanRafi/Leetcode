public class AddDigits {
    public static void main(String[] args) {
        int num=100;
        int ans = add(num);
        System.out.println(ans);
    }

    static int add(int num) {
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }
//        if (num==0){
//            return 0;
//        }
//        int add=0;
//
//        while(num > 0){
//
//            int r = num%10;
//            add= add+r;
//            num = num/10;
//        }
//        int count=0;
//
//        while(add > 0){
//            count ++;
//            add = add/10;
//
//        }
//        if (num<10) {
//            return num;
//        }
//        return count;
//        }
    }


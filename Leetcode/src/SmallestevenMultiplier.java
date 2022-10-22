public class SmallestevenMultiplier {
    public static void main(String[] args) {
        int n=44;
        int num=evenmultiplier(n);
        System.out.println(num);
    }

    static int evenmultiplier(int n) {
        if(n%2==0)
        {
            return n;
        }
        else
            return n*2;
    }

}

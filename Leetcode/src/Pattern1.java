public class Pattern1 {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        for(int i = row; i >= 1; --i)
        {

            for(int j = i; j <= 2*i-1; ++j)
                System.out.print(j);
//
//            for(int j = 0; j < i-1; ++j)
//                System.out.print("* ");
            System.out.println();
        }
    }
}

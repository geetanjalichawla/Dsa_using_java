/*
3
44
555
6666
555
44
3
*/
public class Q8_png5ka1SolidHalfDiamond {
    public static void main(String[] args) {
        int  n = 4;
        int ref = 2;
        for (int i = 1; i <= n; i++)
        {
            ++ref;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ref);
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--)
        {   ref--;
            for (int j = 0; j < i; j++)
            {
                System.out.print(ref);
            }

            System.out.println();
        }

    }
}

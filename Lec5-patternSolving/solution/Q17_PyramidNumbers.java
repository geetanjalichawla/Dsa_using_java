// for n = 5
//     1 --- 1+1-1
//    232 --- 2+2-1
//   34543--- 3+3-1
//  4567654 ----- 4+4-1
// 567898765 ----- 5+5-1

public class Q17_PyramidNumbers {
    public static void main(String[] args) {
        int n = 5;
        int count ;

        for (int i = 1; i <= n; i++)
        {
            count = i-1;
            for (int k = 1; k <= n-i; k++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print(++count);

            }
            for (int j = 1; j <= i-1; j++)
            {

                count--;
                System.out.print(count);
            }
            System.out.println();

        }
    }
}

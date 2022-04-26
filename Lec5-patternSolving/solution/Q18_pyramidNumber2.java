// for n = 5
//     1 ---
//    121 ---
//   12321---
//  1234321 -----
// 123454321-----
public class Q18_pyramidNumber2 {
    public static void main(String[] args) {

        int n = 5;
        int count ;

        for (int i = 1; i <= n; i++)
        {
            count = 0;
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

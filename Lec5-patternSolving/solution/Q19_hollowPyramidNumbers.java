// for n = 5
//     1 ---
//    1 2 ---
//   1   3---
//  1     4 -----
// 1 2 3 4 5 -----

public class Q19_hollowPyramidNumbers {
    public static void main(String[] args) {
        int n = 5;


        for (int i = 1; i <= n; i++)
        {

            //first triangle ---space
            for (int k = 1; k <= n-i; k++)
            {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++)
            {

                if(i == n)
                    System.out.print(j+" ");
                else
                {
                    if(j == 1)
                        System.out.print(j+" ");
                    else if(j == i )
                    {
                        System.out.print(i+" ");
                    }
                    else
                        System.out.print("  ");
                }


            }
            System.out.println();

        }
    }
}

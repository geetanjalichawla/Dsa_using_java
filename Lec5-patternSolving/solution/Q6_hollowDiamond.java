/* hollow dimond shape


    *
   * *
  *   *
 *     *
 *     *
  *   *
   * *
    *

 */
public class Q6_hollowDiamond {
    public static void main(String[] args) {
        int n =4;
        for (int i = 1; i <= n; i++)
        {
            for (int  j = 1; j <= n; j++)
            {
                if(j<= n-i)
                    System.out.print(" ");
                else{
                    if (j == n-i+1 || j == n)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();

        }
        for (int i = 1; i <= n; i++)
        {
            for (int  j = 1; j <= n; j++)
            {
                if(i-j >=1 )
                    System.out.print(" ");
                else
                if(j == n|| j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
}

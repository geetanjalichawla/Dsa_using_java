

public class Q13_hollowInvertedPyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0 ; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i+1; j++)
            {
                if (i == 1)
                {
                    System.out.print("* ");
                }
                else{
                    if( j == 1 || j == n-i+1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");

                }


            }
            System.out.println();

        }
    }
}

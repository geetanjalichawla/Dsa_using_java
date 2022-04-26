
// hollow full pyramid
// 1. space in every case will be row - 1 times
// 2 .and if the row number is 1 or n mwe have to treat differently
// 3. in 2 to n-1 part we have modified it something

public class Q12_HollowPyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == n) {
                    System.out.print("* ");
                } else {
                    if (j == 1 || j == i)
                        System.out.print("* ");
                    else
                        System.out.print("  ");

                }


            }
            System.out.println();
        }
    }
}
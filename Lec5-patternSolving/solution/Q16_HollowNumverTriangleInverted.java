public class Q16_HollowNumverTriangleInverted {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                if (i == n) {
                    System.out.print(k + " ");
                } else {
                    if (k == 1 || k == i) {
                        System.out.print(k + " ");
                    } else
                        System.out.print("  ");

                }

            }
            System.out.println();
        }
    }
}
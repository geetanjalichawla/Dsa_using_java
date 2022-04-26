public class Q15_NumberTriangleInverted {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int k = 1; k <= n+1-i; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

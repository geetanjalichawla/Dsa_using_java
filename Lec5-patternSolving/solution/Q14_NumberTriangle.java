public class Q14_NumberTriangle {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

public class MultiplyMatrices {
    public static void main(String args[]) {

        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int b[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int multiplication [][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiplication[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    multiplication [i][j] += a[i][k] * b[k][j];
                }
                System.out.print(multiplication[i][j] + " ");
            }
            System.out.println();
        }
    }
}
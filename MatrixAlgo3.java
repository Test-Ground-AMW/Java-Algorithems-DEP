import java.util.Arrays;

public class MatrixAlgo3 {
    public static void main(String[] args) {
        int[][] m1 = {{2,3,-1,2},{4,-2,7,3},{-8,2,1,-4},{2,3,1,2}};
        int[][] m2 = {{1,7,-8,2},{-4,6,2,3},{2,3,-1,2},{4,1,2,3}};

        int[][] result = new int[4][4];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                result[i][j] = m1[j][i] + m2[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}

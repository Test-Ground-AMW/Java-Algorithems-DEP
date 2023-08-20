import java.util.Arrays;

public class MatrixAlgo1 {
    public static void main(String[] args) {
        int[][] m = {{2,3,-1,2},{4,-2,7,3},{-8,2,1,-4}};

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] *= (-1);
            }
        }
        System.out.println(Arrays.toString(m[0]));
        System.out.println(Arrays.toString(m[1]));
        System.out.println(Arrays.toString(m[2]));
    }
}

package Project.Testing.black_box;

import Project.SourceCode.Matrix;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BlackBoxTest {

    // Applying Boundary Value Analysis and Equivalence class partitioning on add function
    @Test
    public void addMatrix() {
        // test case 1: to test the range where number of columns of matrix 1 equals number of columns of matrix 2
        // and test the range where number of rows of matrix 1 equals number of rows of matrix 2
        Matrix matrix = new Matrix();
        int[][] addMatrix = {{2,2},{2,2}};
        int[][] matrix1 = {{1,1},{1,1}};
        int[][] matrix2 = {{1,1},{1,1}};
        assertArrayEquals(addMatrix,matrix.addMatrix(matrix1,matrix2,2,2,2,2));

        //test case 2: to test the range where number of columns of matrix 1 doesn't equal number of columns of matrix 2
        int[][] addMatrix1 = {{-1},{-1}};
        int[][] matrix3 = {{1,1},{1,1}};
        int[][] matrix4 = {{1,1,1},{1,1,1}};
        assertArrayEquals(addMatrix1,matrix.addMatrix(matrix3,matrix4,2,2,2,3));

        //test case 3: to test the range where number of rows of matrix 1 doesn't equal number of rows of matrix 2
        int[][] addMatrix2 = {{-1},{-1}};
        int[][] matrix5 = {{1,1},{1,1}};
        int[][] matrix6 = {{1,1},{1,1},{3,4}};
        assertArrayEquals(addMatrix2,matrix.addMatrix(matrix5,matrix6,2,2,3,2));

        //test case 4 to test the range of values of the matrix are negative
        int[][] addMatrix3 = {{-2,-2},{-2,-2}};
        int[][] matrix7 = {{-1,-1},{-1,-1}};
        int[][] matrix8 = {{-1,-1},{-1,-1}};
        assertArrayEquals(addMatrix3,matrix.addMatrix(matrix7,matrix8,2,2,2,2));

        //test case 5 to test the range of values of the matrix are zeros
        int[][] addMatrix4 = {{0,0},{0,0}};
        int[][] matrix9 = {{0,0},{0,0}};
        int[][] matrix10 = {{0,0},{0,0}};
        assertArrayEquals(addMatrix4,matrix.addMatrix(matrix9,matrix10,2,2,2,2));


    }

    // Applying Boundary Value Analysis and Equivalence class partitioning on subtract function
    @Test
    public void subtractMatrix() {
        // test case 1: to test the range where number of columns of matrix 1 equals number of columns of matrix 2
        // and test the range where number of rows of matrix 1 equals number of rows of matrix 2
        Matrix matrix = new Matrix();
        int[][] subMatrix = {{2,2},{2,2}};
        int[][] matrix1 = {{3,3},{3,3}};
        int[][] matrix2 = {{1,1},{1,1}};
        assertArrayEquals(subMatrix,matrix.subtractMatrix(matrix1,matrix2,2,2,2,2));

        //test case 2: to test the range where number of columns of matrix 1 doesn't equal number of columns of matrix 2
        int[][] subMatrix1 = {{-1},{-1}};
        int[][] matrix3 = {{1,1},{1,1}};
        int[][] matrix4 = {{1,1,1},{1,1,1}};
        assertArrayEquals(subMatrix1,matrix.subtractMatrix(matrix3,matrix4,2,2,2,3));

        //test case 3: to test the range where number of rows of matrix 1 doesn't equal number of rows of matrix 2
        int[][] subMatrix2 = {{-1},{-1}};
        int[][] matrix5 = {{1,1},{1,1}};
        int[][] matrix6 = {{1,1},{1,1},{3,4}};
        assertArrayEquals(subMatrix2,matrix.subtractMatrix(matrix5,matrix6,2,2,3,2));

        //test case 4 to test the range of values of the matrix are negative
        int[][] subMatrix3 = {{0,0},{0,0}};
        int[][] matrix7 = {{-1,-1},{-1,-1}};
        int[][] matrix8 = {{-1,-1},{-1,-1}};
        assertArrayEquals(subMatrix3,matrix.subtractMatrix(matrix7,matrix8,2,2,2,2));

        //test case 5 to test the range of values of the matrix are zeros
        int[][] subMatrix4 = {{0,0},{0,0}};
        int[][] matrix9 = {{0,0},{0,0}};
        int[][] matrix10 = {{0,0},{0,0}};
        assertArrayEquals(subMatrix4,matrix.subtractMatrix(matrix9,matrix10,2,2,2,2));
    }
}

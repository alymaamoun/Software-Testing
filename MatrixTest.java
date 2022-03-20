import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void addMatrix() {
        //test case 1 to test the main operation
        Matrix matrix = new Matrix();
        int[][] addMatrix = {{2,2},{2,2}};
        int[][] matrix1 = {{1,1},{1,1}};
        int[][] matrix2 = {{1,1},{1,1}};
        assertArrayEquals(addMatrix,matrix.addMatrix(matrix1,matrix2,2,2,2,2));

        //test case 2 to test the else if condition of suitable matrices
        int[][] addMatrix1 = {{-1},{-1}};
        int[][] matrix3 = {{1,1},{1,1}};
        int[][] matrix4 = {{1,1},{1,1},{3,4}};
        assertArrayEquals(addMatrix1,matrix.addMatrix(matrix3,matrix4,2,2,3,3));

        //test case 3 to test the if condition of input mismatch
        int[][] addMatrix2 = {{-1},{-1}};
        int[][] matrix5 = {{1,1},{1,1}};
        int[][] matrix6 = {{1,1},{1,1}};
        assertArrayEquals(addMatrix2,matrix.addMatrix(matrix5,matrix6,2,2,3,3));
    }

    @Test
    public void subtractMatrix() {
        //test case 2 to test the main operation else if
        Matrix matrix = new Matrix();
        int[][] subMatrix = {{2,2},{2,2}};
        int[][] matrix1 = {{3,3},{3,3}};
        int[][] matrix2 = {{1,1},{1,1}};
        assertArrayEquals(subMatrix,matrix.subtractMatrix(matrix1,matrix2,2,2,2,2));

        //test case 2 to test the else condition of non suitable matrices
        int[][] subMatrix1 = {{-1},{-1}};
        int[][] matrix3 = {{1,1},{1,1}};
        int[][] matrix4 = {{1,1},{1,1},{3,4}};
        assertArrayEquals(subMatrix1,matrix.subtractMatrix(matrix3,matrix4,2,2,3,3));

        //test case 3 to test the if condition of input mismatch
        int[][] subMatrix2 = {{-1},{-1}};
        int[][] matrix5 = {{1,1},{1,1}};
        int[][] matrix6 = {{1,1},{1,1},{3,4}};
        assertArrayEquals(subMatrix2,matrix.subtractMatrix(matrix3,matrix4,2,2,3,2));
    }

    @Test
    public void multiplyMatrix() {
        //test case 1 to test the main operation else if
        Matrix matrix = new Matrix();
        int[][] mulMatrix = {{18,24},{18,24}};
        int[][] matrix1 = {{3,3},{3,3}};
        int[][] matrix2 = {{2,3},{4,5}};
        assertArrayEquals(mulMatrix,matrix.multiplyMatrix(matrix1,matrix2,2,2,2,2));

        //test case 2 to the rows and columns
        int[][] mulMatrix1 = {{14,18},{17,22}};
        int[][] matrix3 = {{1,1,4},{1,1,5}};
        int[][] matrix4 = {{1,1},{1,1},{3,4}};
        assertArrayEquals(mulMatrix1,matrix.multiplyMatrix(matrix3,matrix4,2,3,3,2));

        //test case 3 to test the if condition of input mismatch
        int[][] mulMatrix2 = {{-1},{-1}};
        int[][] matrix5 = {{1,1},{1,1}};
        int[][] matrix6 = {{1,1},{1,1},{3,4}};
        assertArrayEquals(mulMatrix2,matrix.subtractMatrix(matrix5,matrix6,2,3,3,2));
    }

    @Test
    public void scalarmultiplyMatrix() {
        //test case 1 to test the main operation
        Matrix matrix=new Matrix();

        int [][] result={{5,10},{20,40}};
        int [][] test={{1,2},{4,8}};

        assertArrayEquals(result,matrix.scalarmultiplyMatrix(test,5,2,2));

        //test case 2 to test the input mismatch
        int [][] result2={{-1},{-1}};
        int [][] test2={{3,5},{1,4}};

        assertArrayEquals(result2,matrix.scalarmultiplyMatrix(test2,5,3,2));
    }

}
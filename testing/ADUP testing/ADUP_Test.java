package Project;

import org.junit.Test;

import static org.junit.Assert.*;

public class ADUP_Test
{

    @Test
    public void isVector()
    {
        // test case 1
        Matrix matrix = new Matrix();
        assertTrue(matrix.isVector(1,1));

        // test case 2
        assertTrue(matrix.isVector(1,3));

        // test case 3
        assertTrue(matrix.isVector(3,1));

        // test case 4
        assertFalse(matrix.isVector(2,2));
    }

    @Test
    public void matrixSize()
    {
        // test case 1
        Matrix matrix = new Matrix();
        assertTrue(matrix.matrixSize(2,2));

        // test case 2
        assertFalse(matrix.matrixSize(2,3));
    }
}
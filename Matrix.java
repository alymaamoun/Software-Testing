public class Matrix {
    int [][] faultMatrix={{-1},{-1}};
    public int[][] addMatrix(int[][] matrix1, int[][] matrix2, int rows1, int columns1, int rows2, int columns2){

        int sumMatrix[][] = new int[rows1][columns1];

        if(matrix1.length!=rows1 || matrix1[0].length!=columns1 ||
                matrix2.length!=rows2 || matrix2[0].length!=columns2){

            System.out.println("inputs do not match");
            return faultMatrix;
        }

        else if(rows1 == rows2 && columns1 == columns2){
            for (int i=0; i<rows1; i++){
                for (int j=0; j<columns1; j++){
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        else {
            System.out.println("Rows and columns are not equal so addition can not be performed");
            return faultMatrix;
        }

        return sumMatrix;
    }

    public int[][] subtractMatrix(int[][] matrix1, int[][] matrix2, int rows1, int columns1, int rows2, int columns2){
        int subMatrix[][] = new int[rows1][columns1];

        if(matrix1.length!=rows1 || matrix1[0].length!=columns1 ||
                matrix2.length!=rows2 || matrix2[0].length!=columns2){

            System.out.println("inputs do not match");
            return faultMatrix;
        }

         else if(rows1 == rows2 || columns1 == columns2){
            for (int i=0; i<rows1; i++){
                for (int j=0; j<columns1; j++){
                    subMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
         else {
            System.out.println("Rows and columns are not equal so subtraction can not be performed");
            return faultMatrix;
        }

        return subMatrix;
    }

    public int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2, int rows1, int columns1, int rows2, int columns2){
        /*
            This Code causes a bug that was caught by multiply function test , test case 2
                    int mulMatrix[][] = new int[rows1][columns1];
        */

        //bug fixed
        int mulMatrix[][]=new int[rows1][columns2];

        if(matrix1.length!=rows1 || matrix1[0].length!=columns1 ||
                matrix2.length!=rows2 || matrix2[0].length!=columns2){

            System.out.println("inputs do not match");
            return faultMatrix;
        }

        else if(columns1 == rows2) {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    mulMatrix[i][j]=0;
                    for (int k = 0; k < columns1; k++) {
                       /*
                        This Code causes a bug that was caught by multiply function test , test case 1
                        mulMatrix[i][j] = mulMatrix[i][k] + matrix1[i][k] * matrix2[k][j];
                        */

                        //bug fixed
                        mulMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        else {
            System.out.println("Multiplication can not be performed");
            return faultMatrix;
        }

        return mulMatrix;
    }

    public int[][] scalarmultiplyMatrix(int[][] matrix1, int number, int rows1, int columns1){
        int mulMatrix[][] = new int[rows1][columns1];
        if(matrix1.length!=rows1 || matrix1[0].length!=columns1){
            System.out.println("inputs do not match");
            return faultMatrix;
        }
        else {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    mulMatrix[i][j] = number * matrix1[i][j];
                }
            }
        }
        return mulMatrix;
    }

    public int[][] transposeMatrix(int[][] matrix1, int rows1, int columns1){
        int transposeMatrix[][] = new int[rows1][columns1];
        for (int i=0; i<columns1; i++){
            for (int j=0; j<rows1; j++){
                transposeMatrix[i][j] = matrix1[j][i];
            }
        }
        return transposeMatrix;
    }

}

package Project;

import Project.SourceCode.Matrix;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {

    //My main Class

    private static int rows1=3,rows2=3;
    private static int columns1=3,columns2=3;
    private static ArrayList<String> characters = new ArrayList<String>(10);
    static String read = "";
    private static String firstMatrix;
    private static String secondMatrix;
    private static Scanner input = new Scanner(System.in);
    private static int matrix1[][] = new int[100][100];
    private static int matrix2[][] = new int[100][100];

    
    public static void  mainCaller()
    {
        System.out.println("Instructions: \n - Enter your equation like \"A+B\" \n - User ^ this symbol for transpose i.e A^ - B \n - Separate with spaces");
        Matrix matrix = new Matrix();
        System.out.println("Enter your equation: ");
        String equation = input.nextLine();

        StringTokenizer stt = new StringTokenizer(equation," ");

        while (stt.hasMoreTokens()){
            String token = stt.nextToken();
            characters.add(token);
        }

        for (String character : characters) {
            System.out.println(character);
        }

        if(characters.size() == 3){
            if(isTranspose(characters.get(0))){
                firstMatrix = characters.get(0).replace(characters.get(0),"");
                initiateFirstMatrix();
                matrix1 = matrix.transposeMatrix(matrix1,rows1,columns1);

            } else if(isInverse(characters.get(0))){
                firstMatrix = characters.get(0).replace(characters.get(0),"");
                initiateFirstMatrix();
                matrix1 = matrix.transposeMatrix(matrix1,rows1,columns1);

            } else {
                firstMatrix = characters.get(2);
                initiateFirstMatrix();
            }

            if(isTranspose(characters.get(2))){
                secondMatrix = characters.get(2).replace(characters.get(2),"");
                initiateSecondMatrix();
                matrix2 = matrix.transposeMatrix(matrix2,rows2,columns2);
            } else if(isInverse(characters.get(2))){
                secondMatrix = characters.get(2).replace(characters.get(2),"");
                initiateSecondMatrix();
                matrix2 = matrix.transposeMatrix(matrix2,rows2,columns2);
            } else {
                secondMatrix = characters.get(2);
                initiateSecondMatrix();
            }

            switch (characters.get(1)) {
                case "+":
                    int addMatrix[][] = new int[rows1][columns1];
                    addMatrix = matrix.addMatrix(matrix1, matrix2, rows1, columns1, rows2, columns2);
                    matrix.matrixSize(rows1, columns1);
                    displayStub(addMatrix);
                    break;
                case "-":
                    int subMatrix[][] = new int[rows1][columns1];
                    subMatrix = matrix.subtractMatrix(matrix1, matrix2, rows1, columns1, rows2, columns2);
                    matrix.matrixSize(rows1, columns1);
                    display(subMatrix);
                    break;
                case "*":
                    int mulMatrix[][] = new int[rows1][columns1];
                    mulMatrix = matrix.multiplyMatrix(matrix1, matrix2, rows1, columns1, rows2, columns2);
                    matrix.matrixSize(rows1, columns2);
                    display(mulMatrix);
                    break;
            }
        }
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        mainCaller();
        
    }

    private static boolean isTranspose(String name){
        return name.endsWith("^");
    }

    private static boolean isInverse(String name){
        return name.endsWith("^");
    }

    private static void initiateFirstMatrix(){
        System.out.println("First matrix:");
        System.out.println("Enter rows of matrix:");
        rows1 = input.nextInt();
        System.out.println("Enter columns of matrix:");
        columns1 = input.nextInt();
        System.out.println("Enter values for matrix: ");
        Random random = new Random();

        for (int i=0; i<rows1; i++){
            for (int j=0; j<columns1; j++){
                matrix1[i][j] = random.nextInt(50) + 1;
            }
        }
    }

    private static void initiateSecondMatrix(){
        System.out.println("Second matrix:");
        System.out.println("Enter rows of matrix:");
        rows2 = input.nextInt();
        System.out.println("Enter columns of matrix:");
        columns2 = input.nextInt();
        System.out.println("Enter values for matrix: ");
        Random random = new Random();

        for (int i=0; i<rows2; i++){
            for (int j=0; j<columns2; j++){
                matrix2[i][j] = random.nextInt(50) + 1;
            }
        }
    }

    private static void display(int[][] matrix){
        System.out.println("Resultant matrix is: ");
        if(matrix == null){
            return;
        }else {
            for (int i=0; i<rows2; i++){
                for (int j=0; j<columns2; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
       
    }
    
    
    
    
    
    
    
    
    
    private static void displayStub(int[][] matrix){
        System.out.println("Stub matrix is: ");
        int[][] stubmatrix = { { 1, 2 }, { 3, 4 } };

            for (int i=0; i<2; i++)
            {
                for (int j=0; j<2; j++)
                {
                    System.out.print(stubmatrix[i][j] + " ");
                } 
                System.out.print("\n");
            }
    }
    
    
    
    
    
    
    public static void  mainCallerDriver()
        {
            Matrix matrix = new Matrix();
            rows1=2;
            columns1=2;
            rows2=2;
            columns2=2;
            int[][] matrix1 = { { 1, 2 }, { 3, 4 } };
            int[][] matrix2 = { { 1, 2 }, { 3, 4 } };
            int addMatrix[][] = new int[2][2];
            addMatrix = matrix.addMatrix(matrix1, matrix2,2,2,2,2);
            
            display(addMatrix);
 
        }
        
    
    
        }
    
    
    
    
    
    

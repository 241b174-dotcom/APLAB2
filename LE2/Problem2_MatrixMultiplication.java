import java.util.*;

class MatrixMismatchException extends Exception {
public MatrixMismatchException(String message) {
super(message);
}
}

public class Problem2_MatrixMultiplication {

public static int[][] multiplyMatrices(int[][] A, int[][] B) throws MatrixMismatchException {

if(A == null || B == null)
throw new MatrixMismatchException("Matrices cannot be null.");

if(A.length == 0 || B.length == 0)
throw new MatrixMismatchException("Matrices cannot be empty.");

int colsA = A[0].length;
int colsB = B[0].length;

for(int i = 0; i < A.length; i++) {
if(A[i].length != colsA)
throw new MatrixMismatchException("Invalid Matrix A dimensions.");
}

for(int i = 0; i < B.length; i++) {
if(B[i].length != colsB)
throw new MatrixMismatchException("Invalid Matrix B dimensions.");
}

if(colsA != B.length)
throw new MatrixMismatchException("Matrix dimensions do not match for multiplication.");

int[][] result = new int[A.length][B[0].length];

for(int i = 0; i < A.length; i++) {
for(int j = 0; j < B[0].length; j++) {
for(int k = 0; k < colsA; k++) {
result[i][j] += A[i][k] * B[k][j];
}
}
}

return result;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

try {
System.out.print("Enter rows and cols for Matrix A: ");
int rA = sc.nextInt();
int cA = sc.nextInt();

int[][] A = new int[rA][cA];

for(int i=0; i<rA; i++)
for(int j=0; j<cA; j++)
A[i][j] = sc.nextInt();

System.out.print("Enter rows and cols for Matrix B: ");
int rB = sc.nextInt();
int cB = sc.nextInt();

int[][] B = new int[rB][cB];

for(int i=0; i<rB; i++)
for(int j=0; j<cB; j++)
B[i][j] = sc.nextInt();

int[][] result = multiplyMatrices(A, B);

System.out.println("Resulting Matrix:");

for(int[] row : result)
System.out.println(Arrays.toString(row));

}
catch(MatrixMismatchException e) {
System.out.println("Error: " + e.getMessage());
}
finally {
sc.close();
}
}
}

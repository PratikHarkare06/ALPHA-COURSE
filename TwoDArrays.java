// // Print a 2D array (matrix) after taking input from the user
// // import java.util.*;
// // public class TwoDArrays {
    
// //     public static void main(String[] args) {
        
// //         Scanner sc = new Scanner(System.in);
// //         int rows = 3;
// //         int cols = 3;
// //         int matrix [][] = new int[rows][cols];
// //         for(int i=0;i<rows;i++){
// //             for(int j=0;j<cols;j++){
// //                 matrix[i][j] = sc.nextInt();
// //             }
// //         }

// //         // Print the 2D array (Output)
// //         System.out.println("The matrix is:");
// //         for(int i=0;i<rows;i++){
// //             for(int j=0;j<cols;j++){
// //                 System.out.print(matrix[i][j] + " ");
// //                 }
// //             System.out.println();
// //         }

            
// //     }
    
// // }









// // Search an element in a 2D array
// // import java.util.*;
// // public class TwoDArrays {
// //     public static boolean searchEleement(int matrix[][], int key){
// //         for(int i =0;i<matrix.length;i++){
// //             for(int j=0;j<matrix[0].length;j++){
// //                 if(matrix[i][j] == key){
// //                     System.out.println("Element found at index: " + i + ", " + j+ " " +"Value: " + matrix[i][j]);
// //                     return true;
// //                 }
// //             }

// //             }
// //             System.out.println("Element not found");
// //         return false;   
// //     }
// //     public static void main(String[] args) {
        
// //         Scanner sc = new Scanner(System.in);
// //         int rows = 3;
// //         int cols = 3;
// //         int matrix [][] = new int[rows][cols];
// //         for(int i=0;i<rows;i++){
// //             for(int j=0;j<cols;j++){
// //                 matrix[i][j] = sc.nextInt();
// //             }
// //         }

// //         // Print the 2D array (Output)
// //         System.out.println("The matrix is:");
// //         for(int i=0;i<rows;i++){
// //             for(int j=0;j<cols;j++){
// //                 System.out.print(matrix[i][j] + " ");
// //                 }
// //             System.out.println();
// //         }
       
// //         searchEleement(matrix, 5);


            
// //     }
    
// // }




// // Diagnoal Sum of a 2D array
// //Important question asked in companies like Amazon, Google, Microsoft,Adobe,Apple etc.
// // import java.util.*;
// // public class TwoDArrays {
// //     public static void printSpiral(int matrix[][]){
// //         int startRow = 0;
// //         int endRow = matrix.length - 1;
// //         int startCol = 0;
// //         int endCol = matrix[0].length - 1;

// //         while(startRow <= endRow && startCol <= endCol){
// //             // Top.     j is for columns and startRow is fixed  
// //             for(int  j=startCol; j<=endCol; j++){
// //                 System.out.print(matrix[startRow][j] + " ");
// //             }
// //             // Right.   i is for rows and endCol is fixed
// //             for(int i=startRow + 1; i<=endRow; i++){ // startRow + 1 to avoid double printing
// //                 System.out.print(matrix[i][endCol] + " ");
// //                 }
// //                 // Bottom.   j is for columns and endRow is fixed
// //                 for(int j=endCol - 1; j>=startCol; j--){ // endCol - 1 to avoid double printing
// //                     if(startRow == endRow){
// //                         break;
// //                     }
// //                     System.out.print(matrix[endRow][j] + " ");
// //                 }
// //                 // Left.   i is for rows and startCol is fixed
// //                 for(int i=endRow - 1; i>=startRow + 1; i --){ // endRow - 1 and startRow + 1 to avoid double printing
// //                     if(startCol == endCol){
// //                         break;
// //                     }
// //                     System.out.print(matrix[i][startCol] + " ");
// //                 }
// //                 startRow++;
// //                 endRow--;
// //                 startCol++;
// //                 endCol--;

// //         }
// //         System.out.println();


            
        
// //     }
// //     public static void main(String[] args) {
// //         int matrix[][] = {
// //             {1, 2, 3, 4},
// //             {5, 6, 7, 8},
// //             {9, 10, 11, 12},
// //             {13, 14, 15, 16}

// //         };
// //         printSpiral(matrix);

            
// //     }

// // }





// // Diagonal Sum of a 2D array (Brute Force Approach)
// import java.util.*;
// public class TwoDArrays {
//     public static int diagonalSum(int matrix[][]){
//         int sum = 0;
//         // // Primary diagonal
//         for(int i =0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(i == j){
//                     sum += matrix[i][j];
//                 }
//                 // Secondary diagonal
//                 else if(i + j == matrix.length - 1){
//                     sum += matrix[i][j];
//                 }
//             }
//         }
//         return sum;
       
//     }
           
            
//     public static void main(String[] args) {
//         int matrix[][] = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         System.out.println("The diagonal sum is: " + diagonalSum(matrix));

        
//     }
//     // Time Complexity: O(n^2)
// }















//
// // Diagonal Sum of a 2D array (Optimal Approach)
// import java.util.*;
// public class TwoDArrays {
//     public static int diagonalSum(int matrix[][]){
//         int sum = 0;
//         // // Primary diagonal
//         for(int i =0;i<matrix.length;i++){
//             sum += matrix[i][i]; // Primary diagonal
//             if(i != matrix.length - 1 - i){ // To avoid double counting the center element in odd sized matrix
//                 sum += matrix[i][matrix.length - 1 - i]; // Secondary diagonal
//             }
//         }
        
//         return sum;
       
//     }
           
            
//     public static void main(String[] args) {
//         int matrix[][] = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         System.out.println("The diagonal sum is: " + diagonalSum(matrix));

        
//     }
//     // Time Complexity: O(n)
// }












// Search in a sorted 2D array (Staircase Search)
import java.util.*;
public class TwoDArrays {
    public static boolean stairCaseSearch(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Element found at index: " + row + ", " + col + " " + "Value: " + matrix[row][col]);
                return true;
            }
            else if(matrix[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Element not found");
        return false;

                
        
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        stairCaseSearch(matrix, 60);
        
    }
}
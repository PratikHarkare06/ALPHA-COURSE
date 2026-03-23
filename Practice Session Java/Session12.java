// Practice Question 2D Array: 
// Question 1: Count the occurrences of a target number in a 2D array
// import java.util.*;
// public class Session12 {

//     public static int countTarget(int[][] arr, int target) {
//         int count = 0;

//         for(int i = 0; i < arr.length; i++){ // here arr.length is used to get the number of rows
//             for(int j = 0; j < arr[i].length; j++){ // here arr[i].length is used to get the length of each row in the 2D array
//                 if(arr[i][j] == target){
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         int target = 7;

//         int arr[][] = {
//             {4, 7, 8},
//             {8, 8, 7},
//         };

//         int count = countTarget(arr, target);

//         System.out.println("The count of target " + target + " is: " + count);
       
    
//     }
// }









// Sum of rows in a 2D array
// import java.util.*;
// public class Session12{
//     public static void rowSum(int[][] arr){
//             int sum = 0;
//             //Calculates the sum of each row. just change the index  sum += arr[i][j];
//             for(int j =0; j<arr[0].length; j++){
//                 sum += arr[2][j];
//             }
//             System.out.println("The sum of row "  + " is: " + sum);
//         }
        
    
//     public static void main(String[] args) {
//         int nums [][] = {
//             {1, 4,9},
//             {11, 4, 3},
//             {2,2,3}
        
//     };
//         rowSum(nums);
//     }
// }









// Transpose of a 2D array
// import java.util.*;
// public class Session12{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols =sc.nextInt();

//         int[][] arr = new int[rows][cols];

//         // Input
//         for(int i =0; i<rows; i++){
//             for(int j =0; j<cols; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         int[][] transpose = new int[cols][rows];

//        // Transpose logic
//         for(int i =0; i<cols; i++){ // rows becomes columns and vice versa thats why i and j are switched and is called transpose
//             for(int j =0; j<rows; j++){
//                 transpose[i][j] = arr[j][i];
//             }
//         }
//         System.out.println("The transpose of the matrix is: ");        
//         for(int i =0; i<cols; i++){
//             for(int j =0; j<rows; j++){
//                 System.out.print(transpose[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
        

        
//     }




//
import java.util.*;
public class Session12{
    public static void staircaseSearch(int [][] arr, int target){
        int row = 0;
        int col = arr[0].length - 1; // length of the last row as we want to start from the last row

        while(row < arr.length && col>=0){
            if(arr [row][col] == target){
                System.out.println("Target found at row " + row + " and column " + col);
                return;
            }
            else if(arr[row][col] < target){
                row++; // search in the next row
            }
            else{
                col--; // search in the previous column as we are moving left
            }
        }
        System.out.println("Target not found");
        
    }
    public static void main(String[] args) {
        int arr [][] = {
            {1, 4,9},
            {11, 4, 3},
            {2,2,3}
        
        };
        staircaseSearch(arr, 4);
        
    }
}
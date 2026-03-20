// Question :Use the following sorting algorithms tosort an array in DESCENDING order 
// a:.Bubble Sort 
// b.Selection Sort
// c.Insertion Sort
// d.Counting Sort

// You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]
    
// Bubble Sort Algorithm in Descending
// import java.util.*;
// public class BasicSortingQs{
//     public static void bubbleSort(int arr[]){
//         int n = arr.length;
//         //Outer loop
//         for(int turn =0;turn<n-1;turn++){
//             //Inner loop
//             for(int j=0;j<n-1-turn;j++){
//                 if(arr[j]<arr[j+1]){
//                     //Swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//         }
//     }
// }
            
//             public static void printArray(int arr[]){
//             for(int i=0;i<arr.length;i++){
//                 System.out.print(arr[i]+" ");
//                 }
//             System.out.println();
//         }
        

//     public static void main(String[] args) {
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         bubbleSort(arr);
//         printArray(arr);
        
//     }
    
// }



// // Selection Sort Algorithm in Java
// import java.util.*;
// public class BasicSortingQs{
//     public static void selectionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int minPos = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[minPos]<arr[j]){
//                     minPos = j;
//                 }
//             }
//             //Swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

    
//     public static void main (String[] args) {
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         selectionSort(arr);
//         printArray(arr);
//     }
// }

        




// Insertion Sort  Algorithm in Java
// import java.util.*;
// public class BasicSortingQs {
//     public static void insertionSort(int arr[]){

//         for (int i =0;i<arr.length;i++){
//             int current = arr[i];
//             int prev = i-1;
//             //finding out the correct position to insert
//            while(prev>=0 && arr[prev]<current){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             //insertion
//             arr[prev+1] = current;
//             }
//             }
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
    
                
        
//     }
//     public static void main(String[] args) {
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         insertionSort(arr);
//         printArray(arr);
        
        
//     }
// }











// Counting Sort
import java.util.*;
public class BasicSortingQs {
    public static void countingSort(int arr[], int range){
        int Largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            Largest = Math.max(Largest, arr[i]);
        }

        int count[] = new int[Largest + 1];

        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        // Sorting in DESCENDING order
        int j = 0;   // FIXED — fill from the start

        for(int i = count.length - 1; i >= 0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        countingSort(arr, 8);
        printArray(arr);
    }
}



//Changes made from lecture code to make it work for descending order
//Previous code it was  : while (count[i] <= 0) {
// modified code is : while (count[i] > 0) {
//
//This prevents the count array from going negative and causing:
// Index -1 out of bounds
    
//Second change: 
// Prvious code: int j = arr.length - 1;   // fills array from the end

//  modified code: int j = 0;   // FIXED — fill from the start


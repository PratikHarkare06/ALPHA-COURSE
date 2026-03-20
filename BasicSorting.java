//Bubble Sort Algorithm in Java
//import java.util.*;
// public class BasicSorting {
//     public static void bubbleSort(int arr[]){
//         int n = arr.length;
//         //Outer loop
//         for(int turn =0;turn<n-1;turn++){
//             //Inner loop
//             for(int j=0;j<n-1-turn;j++){
//                 if(arr[j]>arr[j+1]){
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
//         int arr[] = {5,4,1,3,2};
//         bubbleSort(arr);
//         printArray(arr);
        
//     }
    
// }



// // Selection Sort Algorithm in Java
// import java.util.*;
// public class BasicSorting {
//     public static void selectionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int minPos = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[minPos]>arr[j]){
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
//         int arr[] = {5,4,1,3,2};
//         selectionSort(arr);
//         printArray(arr);
//     }
// }

        




//Insertion Sort  Algorithm in Java
// import java.util.*;
// public class BasicSorting {
//     public static void insertionSort(int arr[]){

//         for (int i =0;i<arr.length;i++){
//             int current = arr[i];
//             int prev = i-1;
//             //finding out the correct position to insert
//            while(prev>=0 && arr[prev]>current){
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
//         int arr[] = {5,4,1,3,2};
//         insertionSort(arr);
//         printArray(arr);
        
        
//     }
// }






// Inbuilt Sorting Function in Java(Accending Order)
// import java.util.*;
// import java.util.Arrays; // Importing Arrays class
// public class BasicSorting {
//     public static void insertionSort(int arr[]){

//         for (int i =0;i<arr.length;i++){
//             int current = arr[i];
//             int prev = i-1;
//             //finding out the correct position to insert
//            while(prev>=0 && arr[prev]>current){
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
//         int arr[] = {5,4,1,3,2};
//         // Arrays.sort(arr);
//         Arrays.sort(arr,0,3); //partial sorting with starting and ending index(accending order)
       
//         printArray(arr);
        
        
//     }
// }






//Inbuilt Sorting Function in Java(Decending Order)
// import java.util.*;
// import java.util.Arrays; // Importing Arrays class
// import java.util.Collections; // Importing Collections class

// public class BasicSorting {
//     public static void insertionSort( Integer arr[]){

//         for (int i =0;i<arr.length;i++){
//             int current = arr[i];
//             int prev = i-1;
//             //finding out the correct position to insert
//            while(prev>=0 && arr[prev]>current){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             //insertion
//             arr[prev+1] = current;
//             }
//             }
//     public static void printArray(Integer arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
    
                
        
//     }
//     public static void main(String[] args) {
//         Integer  arr[] = {5,4,1,3,2}; // Using Integer class instead of int primitive type as Collections.reverseOrder() works with objects
//         Arrays.sort(arr,0,3,Collections.reverseOrder()); //partial sorting with starting and ending index (decending order)
//         printArray(arr);
        
        
//     }
// }




// Counting Sort
import java.util.*;
public class BasicSorting {
    public static void countingSort(int arr[], int range){
        int Largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            Largest = Math.max(Largest,arr[i]);
        }
        int count []= new int[Largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while( count[i]>0){
                arr[j] = i; // If frquency is more than 1 then we have to put the same element multiple times
                j++;
                count[i]--;
            }
        }
    }
        

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2,5,4,3,2,1,0};
        int range = 5; // Maximum element in the array
        countingSort(arr,range);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
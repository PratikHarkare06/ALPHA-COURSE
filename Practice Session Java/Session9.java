//Arrays
// import java.util.*;
// public class Session9 {
//     public static void main(String[] args) {
//         int arr []= new int[5]; //declaration and memory allocation of array

//         arr[0]=10; //value assignment to array
//         arr[1]=20;
//         arr[2]=30;
//         arr[3]=40;
//         arr[4]=50;

//         System.out.println(arr[0]); //accessing array elements
//         System.out.println(arr[1]);
//         System.out.println(arr[2]);
//         System.out.println(arr[3]);
//         System.out.println(arr[4]);
        
//     }
// }



//
// import java.util.*;
// public class Session9 {
//     public static void  swap(int a, int b){
//          int temp = a;
//          a = b;
//          b = temp;
        
        
//     }
//     public static void main(String[] args) {
//         int a = 2;
//         int b =5;
//         System.out.println("Before swap: a = " + a + ", b = " + b);
//         swap(a, b); // calling swap method
//         System.out.println("After swap: a = " + a + ", b = " +b);  // values will remain same because java uses pass by value method
//     }      
//     }



//

// import java.util.*;
// public class Session9 {
//     public static void swap(int [] arr){
//          int temp = arr[0];
//          arr[0] = arr[1];
//          arr[1] = temp;
        
//     }
//     public static void main(String[] args) {
//         int arr [] = new int[2];
//         arr[0] = 2;
//         arr[1] = 5;

//         System.out.println("Before swap: arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
//         swap(arr); // calling swap method
//         System.out.println("After swap: arr[0] = " + arr[0] + ", arr[1] = " +arr[1]);  // values will be swapped because we are passing the reference of array
//     }
//     }




// Example linear Search algorithm
// import java.util.*;
// public class Session9 {
//     public static int search(int arr[], int target){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == target){
//                 return i; // return the index if target is found
//             }
//         }
//         return -1; // return -1 if target is not found
//     }
        
//     public static void main(String[] args) {
      
//         int arr [] = {10,14,15,9,18,11};
//         int target = 10;
//         int result = search(arr, target);
//         System.out.println(result);
//     }
//         // Time Complexity: O(n) where n is the number of elements in the array
       
        
//     }




// 
import java.util.*;
public class Session9{
    public static int BinarySearch(int arr[], int target){
        int left =0;
        int right = arr.length -1;
        int mid = left + right /2;

        while(left <= right){ // If left crosses right, target is not present or array is exhausted
            if(arr[mid] == target){
                return mid; // target found
            }
            else if(arr[mid] < target){
                left = mid +1; // search in the right half
            }
            else{
                right = mid -1; // search in the left half
            }
            mid = left + right /2;
        }
        return -1; // target not found
        
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,12,14,16,18};
        int target = 10;
        int result = BinarySearch(arr, target);
        System.out.println(result);
    }


    // Time Complexity: O(log n) where n is the number of elements in the array
        
        
    }

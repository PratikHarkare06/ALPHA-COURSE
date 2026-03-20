// Merge Sort 

// import java.util.*;

// public class DivideAndConquer {

//     public static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void mergeSort(int[] arr, int si, int ei) {
//         // base case
//         if (si >= ei) {
//             return;
//         }

//         int mid = si + (ei - si) / 2;

//         // recursive calls
//         mergeSort(arr, si, mid);       // left part
//         mergeSort(arr, mid + 1, ei);   // right part

//         // merge
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(int[] arr, int si, int mid, int ei) {
//         int[] temp = new int[ei - si + 1];

//         int i = si;        // left iterator
//         int j = mid + 1;   // right iterator
//         int k = 0;         // temp iterator

//         while (i <= mid && j <= ei) {
//             if (arr[i] <= arr[j]) {
//                 temp[k++] = arr[i++];
//             } else {
//                 temp[k++] = arr[j++];
//             }
//         }

//         // remaining left part
//         while (i <= mid) {
//             temp[k++] = arr[i++];
//         }

//         // remaining right part
//         while (j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         // copy temp back to original array
//         for (int index = 0; index < temp.length; index++) {
//             arr[si + index] = temp[index];
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
//         mergeSort(arr, 0, arr.length - 1);
//         printArray(arr);
//     }
// }








// // Quick Sort 

// import java.util.*;
// public class DivideAndConquer {
//     public static void printArray(int arr[]){
//         for(int i =0;i<arr.length;i++){
//             System.out.print(arr[i]+"");
//         }
//         System.out.println();
//         }
//         public static void quickSort(int arr[],int si,int ei){
//             //base case
//             if(si>=ei){
//                 return;
//             }
           
//             int pidx = partition(arr,si,ei);
//             quickSort(arr, si, pidx-1);  //left part 
//             quickSort(arr, pidx+1, ei);  //right part
//         }
//         public static int partition(int arr[],int si,int ei){
//             int pivot = arr[ei]; //pivot element (last element)
//             int i =  si-1;
//             for(int j=si;j<ei;j++){
//                 if(arr[j]<=pivot){
//                     i++;
//                     //swap
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
                    
//             }
//             i++;

//             //swap pivot with correct index
//             int temp = pivot;
//             arr[ei] = arr[i];
//             arr[i] = temp;

//             return i;
            
            
            
            
//         }
//         public static void main(String[] args) {
//             int arr[]={3,6,2,1,8,7,4,5,-2,3,1};
//             quickSort(arr, 0, arr.length-1);
//             printArray(arr);
//         }
//     }









//
import java.util.*;
public class DivideAndConquer {
    public static int search(int arr [],int target,int si,int ei){
        // base case
        if(si>ei){
            return -1;
        }
        //work
        int mid = si+(ei-si)/2;

        //Case 1: element found
        if(arr[mid]==target){
            return mid;
        }
        //Case 2: mid on L1
        if(arr[si]<=arr[mid]){
            //case a:left 
            if(arr[si]<=target && target<=arr[mid]){
                 return search(arr,target,si,mid-1);
            }else{
                //case b:right
                return search(arr,target,mid+1,ei);
            }

        }
        //mid on L2
        else{
            //case c:right
            
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr,target,mid+1,ei);
            }else{
                //case d :left
                return search(arr,target,si,mid-1);
            }
        }
    }


            

        
        


    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target = 6;
        int ans = search(arr,target,0,arr.length-1);
        System.out.println(ans);
        
    }
}
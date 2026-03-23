// import java.util.*;
// public class Session14 {
//     public static void countingSort( int[] arr){ {
//         //!. Get the max value from array
//         int maxValue = arr[0];
//         for(int i = 1; i < arr.length; i++){
//                 maxValue = Math.max(arr[i], maxValue);
//         }
//         //2.Make the frequency array-Size(maxvalue+1)
//         int[] freq = new int[maxValue + 1];
//         for(int i = 0; i < arr.length; i++){
//             int currentValue = arr[i];
//             freq[arr[i]]++;
//         }
//         //3 Using the frequency array, fill the sorted array
//         int index = 0;
//         for(int i = 0; i < freq.length; i++){
//             for(int j = 0; j < freq[i]; j++){
//                 arr[index] = i;
//                 index++;
//             }
            
//         }
//     }
        

            
        
//     }
//     public static void main(String[] args) {
//         int arr [] = {1,4,1,2,7,5,2};
//         countingSort(arr);
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
        
//     }
    
// }




//Anagram String And Insertion Sort Algorithm Discusss in remaing class




//If you convert any char to int  then it gives ascii value

import java.util.*;
public class Session14 {
    public static void main(String[] args) {

char c = 'a'; // A =65 a=97 // you can check any ascii value like #,$ etc
int i = c;
System.out.println(i);
    }
}
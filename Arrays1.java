//Creating an array
// import java.util.*;
// public class Arrays1 {
//     public static void main(String[] args) {
//         int marks [] = new int[10]; // you can only store 10 elements in an array and you cant change the size of an array
//         int numbers []={1,2,3,4,5}; //It will automatically detects the size of the array
//         int moreNumbers[]={6,7,8,9,10};
//         String fruits[]={"apple","banana","cherry","date"};
//     }
    
// }




//Arrays - Input ,Output and Update
// import java.util.*;

// import javax.rmi.ssl.SslRMIClientSocketFactory;
// public class Arrays1 {
//     public static void main(String[] args) {
//          int marks [] = new int[10]; 
//         Scanner sc = new Scanner(System.in);


//         // int phy ;
//         // phy = sc.nextInt();

// // Input in an array
//         marks[0] = sc.nextInt();//physics
//         marks[1] = sc.nextInt();//chemistry
//         marks[2] = sc.nextInt();//biology
//         marks[3] = sc.nextInt();//math


//         //Output from an array
        
//         System.out.println("physics: "+marks[0]);
//         System.out.println("chemistry: "+marks[1]);
//         System.out.println("biology: "+marks[2]);
//         System.out.println("math: "+marks[3]);

//         //Update in array

//         marks[3] = 21;
//         System.out.println("math: "+marks[3]);
        
        
//     }
// }
       
        




// //Arrays as function arguments
// import java.util.*;
// public class Arrays1 {
//     public static void update(int marks[]) {
//         for(int i=0;i<marks.length;i++) {
//             marks[i] = marks[i] + 1;
//         }

        
//     }
//     public static void main(String[] args) {
//         int marks []={96,97,98};
//         update(marks);

//         //Print our marks
//         for(int i=0;i<marks.length;i++) {
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();
        

        
//     }
    
// }






// Linear Search
// import java.util.*;
// public class Arrays1 {
//     public static int LinearSearch(int numbers[],int key) {
//         for(int i=0;i<numbers.length;i++) {
//             if(numbers[i]==key) {
//                 return i;
//             }
//         }
//         return -1; // key Doesnt exist only
        
//     }
//     public static void main(String[] args) {
//         int numbers [] = {1,2,3,4,5,6,7,8,9,10};
//         int key = 15;

//         int index = LinearSearch(numbers,key);
//         if (index==-1) {
//             System.out.println("Key does not exist");
//         }
//         else {
//             System.out.println("Key exists at index :"+index);
//         }
        
        
//     }
    
// }




// HW Linear Search
// import java.util.*;
// public class Arrays1 {
//     public static String LinearSearch(String canteen[],String key) {
//         for(int i=0;i<canteen.length;i++) {
//             if(canteen[i].equals(key)) {
//                 return canteen[i];
//             }
//         }
//             return "Key does not exist";
//         }

        
        

//     public static void main(String[] args) {
//         String canteen[]={"Chole Bhature","Samosa","Burger","Pizza","Pasta"};
//         String key ="Icecream";

//         String result = LinearSearch(canteen,key);
//         System.out.println("Result at index: "+result);

//     }

       
//     }
    





//Largest and Smallest number in an array
// import java.util.*;
// public class Arrays1 {
//     public static int getLargest(int numbers[]) {
//         int largest =Integer.MIN_VALUE; // -infinity(lowest possible value)
//         int smallest =Integer.MAX_VALUE; // infinity(highest possible value)
//         for(int i=0;i<numbers.length;i++) {
//             if(numbers[i]>largest) {
//                 largest = numbers[i];
//             }
//             if(numbers[i]<smallest) {
//                 smallest = numbers[i];
//             }

//         }
//         System.out.println("Smallest number is: "+smallest);
       
//         return largest;

        
//     }

        
    
//     public static void main(String[] args) {
//         int numbers [] = {1,2,3,6,5,4};
//          System.out.println("Largest number is: "+getLargest(numbers));
        
        
//     }
    
//     }

        
        


// Binary Search
// import java.util.*;
// public class Arrays1 {
//     public static int BinarySearch(int numbers[],int key) {
//         int start = 0;
//         int end = numbers.length-1;
//         while(start<=end) {
//             int mid = (start+end)/2;
//             if(numbers[mid]==key) {
//                 return mid;
//             }
//             else if(numbers[mid]>key) {
//                 end = mid-1;
//             }
//             else {
//                 start = mid+1;
//             }
            
//         }
       
//         return -1;
        
//     }
//     public static void main(String[] args) {
//         int numbers [] = {2,4,6,8,10,12,14,};
//         int key = 20;

        
//             System.out.println("Key exists at index :"+BinarySearch(numbers,key));
//         }
        
//     }
    
    


// Reverse an array
// import java.util.*;
// public class Arrays1 {
//     public static int reverse(int numbers[]){
//         int first =0;
//         int last = numbers.length-1;
//         while(first<last) {
//             //swap
//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;
//             first++;
//             last--;
            
//         }
//         return 0;
        
//     }
//     public static void main(String[] args) {
//         int numbers [] = {2,4,6,8,10};
//         reverse(numbers);
//         for(int i=0;i<numbers.length;i++) {
//             System.out.print(numbers[i]+" ");
//             }
//             System.out.println();
        
//         }
//     }




//Print all the pairs of an array
// import java.util.*;
// public class Arrays1 {
//     public static void PrintPairs(int numbers[]) {
//         int tp = 0;
//         for(int i=0;i<numbers.length;i++) {
//             int curr = numbers[i]; //2,4,6,8,10
//             for(int j=i+1;j<numbers.length;j++) {
//                 System.out.print("("+curr+","+numbers[j]+")");
//                 tp++;
//             }
//             System.out.println();

            
        
//         }
//         System.out.println("Total Pairs: "+tp);
        
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10};
//         PrintPairs(numbers);
        
//     }
// }
        




// Print all the subarrays
// import java.util.*;

// public class Arrays1 {

//     public static void PrintSubarrays(int numbers[]) {
//         int ts = 0; // total subarrays count should be declared outside the loops

//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(numbers[k] + " ");
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }

//         System.out.println("Total Subarrays: " + ts);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         PrintSubarrays(numbers);
//     }
// }





// Print  The sum of all the subarrays
import java.util.*;

public class Arrays1 {

    public static void PrintSubarrays(int numbers[]) {
        int ts = 0; // total subarrays count should be declared outside the loops
         int sum = 0;



        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];


                }
                ts++;
                System.out.println();
                System.out.println("Sum of subarray: " + sum);
                sum = 0;

            }
            System.out.println();

        }

        System.out.println("Total Subarrays: " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        PrintSubarrays(numbers);

    }
}


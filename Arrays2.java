// Max Subarray Sum using Brute Force
// import java.util.*;

// public class Arrays2 {

//     public static void MaxSubarraysSum(int numbers[]) {
//         // total subarrays count should be declared outside the loops
//          int Currsum = 0;
//          int Maxsum = Integer.MIN_VALUE; //infinity value



//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 Currsum = 0; // reset everytime we move to next subarray element thats why we have to reset
//                 for (int k = i; k <= j; k++) {
                    
//                     //Sum of subarray
//                     Currsum += numbers[k];
//                 }

//                 System.out.println(Currsum);
//                 if( Maxsum < Currsum){ {
//                     Maxsum = Currsum; // max sum finds
//                 }
                
//             }
            

//         }
//         System.out.println("Max Sum: " + Maxsum);
//         }

        
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1,-2,6,-1,3};
//         MaxSubarraysSum(numbers);



//     }
// }





// Print the Min Sum of all the subarrays

// import java.util.*;

// public class Arrays2 {

//     public static void MinSubarraysSum(int numbers[]) {
//         int Currsum = 0;
//         int Minsum = Integer.MAX_VALUE; // start with a large positive number

//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 Currsum = 0; // reset for each subarray
//                 for (int k = i; k <= j; k++) {
//                     Currsum += numbers[k]; // sum of subarray
//                 }

//                 System.out.println("Subarray sum: " + Currsum);

//                 // find the minimum subarray sum
//                 if (Currsum < Minsum) {
//                     Minsum = Currsum;
//                 }
//             }
//         }

//         System.out.println("Min Sum: " + Minsum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         MinSubarraysSum(numbers);
//     }
// }



// Max Subarray Sum using Prefix Array 
// import java.util.*;

// public class Arrays2 {

//     public static void MaxSubarraysSum(int numbers[]) {
//         // total subarrays count should be declared outside the loops
//          int Currsum = 0;
//          int Maxsum = Integer.MIN_VALUE; //infinity value
//          int prefix[] = new int[numbers.length];
//          prefix[0] = numbers[0];


//          // calculate the prefix array
//          for(int i = 1; i < numbers.length; i++){
           
//             prefix[i] = prefix[i-1] + numbers[i];
//          }
         
//          for(int i = 0; i < prefix.length; i++){
//              int start =i;
//             for(int j = i; j < prefix.length; j++){
//                 int end = j;
//                 Currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

//                 if(Maxsum < Currsum){
//                     Maxsum = Currsum;
//                 }
//             }
//          }

//          System.out.println("Max Sum: " + Maxsum);       

//     }

//     public static void main(String[] args) {
//         int numbers[] = {1,-2,6,-1,3};
//         MaxSubarraysSum(numbers);



//     }
// }



// Print the Max Sum of all the subarrays using Kadane's Algorithm

// import java.util.*;

// public class Arrays2 {
//     public static void kadanes(int numbers[]) {
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0;i<numbers.length;i++) {
//             cs = cs + numbers[i];
//             if(cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(ms,cs); // It will return the max sum of subarray
            
//         }

//         System.out.println("Max Sum: " + ms);
        
//     }
//     public static void main(String[] args) {
//         int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//         kadanes(numbers);
//     }
// }






// Trapping Rainwater Problem
// import java.util.*;
// public class Arrays2 {
//     public static int  TrapRainwater(int height[]) {
//         // Calculate left max boundary - array
//         int leftMax[] = new int[height.length];
//         leftMax[0] = height[0];
//         for(int i=1;i<height.length;i++) {
//             leftMax[i] = Math.max(leftMax[i-1],height[i]);
//         }
//         // Calculate right max boundary - array
//         int rightMax[] = new int[height.length];
//         rightMax[height.length-1] = height[height.length-1];
//         for(int i=height.length-2;i>=0;i--) {
//             rightMax[i] = Math.max(rightMax[i+1],height[i]);
//         }
//         int trappedWater = 0;
//         //loop
//         for(int i=0;i<height.length;i++) {
//             //water level= min(leftMax boundary, rightMax boundary)])
//             int waterLevel = Math.min(leftMax[i],rightMax[i]);
//             trappedWater += waterLevel - height[i];
//         }
//         return trappedWater;

    
      
       
        
//     }
//     public static void main(String[] args) {
//         int height[] = {4,2,0,6,3,2,5};
//         System.out.println("Trapped Water: " + TrapRainwater(height));

//     }
// }
        




// Best Time to
import java.util.*;
public class Arrays2{
    public static int BuySellStocks(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){ // Profit
                int profit = prices[i]-buyPrice; //Todays Profit
                maxProfit = Math.max(maxProfit,profit); // Stores the max profit
            }
            else{
                buyPrice = prices[i];
            }
          
           

        }
          return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(BuySellStocks(prices));
    }
}
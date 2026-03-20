// Practice Question: 1
// import java.util.*;
// public class ArraysQs {
//     public static boolean containsDuplicate(int nums[]){
//         for(int i =0;i<nums.length-1;i++){
//             for(int j =i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
                 
//                     return true;
//                 }

//             }
            
//         }
//         return false;
                
        
//     }
//     public static void  main(String[] args) {
//         int nums [] = {1,2,3,1};
//         boolean result = containsDuplicate(nums);
//         System.out.println("Contains Duplicate: " + result);
        
//     }
// }





















//Practice Question: 2
// import java.util.*;
// public class ArraysQs {
//     public static int indexOfTarget(int arr[], int target){
        
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==target){
//                 return i;
//             }
//         }
//         return -1;


        
//     }
//     public static void main(String[] args) {
//         int arr []= {1};
//         int target = 0;
//         int result = indexOfTarget(arr, target);
//         System.out.println("Index of target is: " + result);
//     }

        
//     }




// Practice Question: 3

import java.util.*;
public class ArraysQs {
    public static int BuySellStocks(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0;i<prices.length;i++) {
            if(buyPrice< prices[i]){
                int profit = prices[i]-buyPrice; // Today's Profit.   Profit = Sell Price - Buy Price
                maxProfit = Math.max(maxProfit, profit); // Stores the max profit
            }
            else{
                buyPrice = prices[i];
            }

            
        }
        return maxProfit;
        
        
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int result = BuySellStocks(prices);
        System.out.println("Maximum Profit: " + result);

        
    }
}
























    




// //Practice Question: 4
// //LeetCode Problem 11: Trapping Rainwater Problem
// import java.util.*;
// public class ArraysQs {
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
//         int height[] = {-1,0,1,2,-1,-4};
//         System.out.println("Trapped Water: " + TrapRainwater(height));
//     }
// }







//Practice Question: 5
// Three Sum Problem
// import java.util.*;
// public class ArraysQs {
//     public static void threeSum(int[] nums, int target) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         for(int i = 0; i < n; i++) {
//             int newTar = target - nums[i];
//             int l = i+1;
//             int r = n-1;
        
//         while(l < r) {
//             int csum = nums[l] + nums[r];

//             if(csum == newTar) {
//                 System.out.println(nums[i] + " " + nums[l] + " " + nums[r]);
//                 l++;
//                 r--;
//             } else if(csum < newTar) {
//                 l++;
//             } else {
//                 r--;
//             }
//         }
//         }
        
//     }

//     public static void main(String[] args) {
//         int[] nums = {};
//         int target = 0;
//         System.out.println("Three Sum: ");
//         threeSum(nums, target);
       

//     }
// }
        
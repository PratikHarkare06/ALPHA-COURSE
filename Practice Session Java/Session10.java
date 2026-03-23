//LeetCode Problem 11: Container With Most Water
// class Solution {
//     public int maxArea(int[] height) {
//         int n = height.length;
//         int l = 0;
//         int r = n - 1;
//         int maxArea = 0;

//         while (l < r) {
//             int h = Math.min(height[l], height[r]);
//             int w = r - l;

//             int currArea = h * w;
//             if (currArea > maxArea) {
//                 maxArea = currArea;
//             }

//             if (height[l] < height[r]) {
//                 l++;
//             } else {
//                 r--;
//             }
//         }

//         return maxArea;
//     }
// }





// Two sum for unsorted array
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         int l = 0;
//         int r = n-1;
      
//         while(l < r) {
//             int csum = nums[l] + nums[r];

//             if(csum == target) {
//                 return new int[] {l,r};
//             } else if(csum < target) {
//                 l++;
//             } else {
//                 r--;
//             }
//         }
        
//         return new int[]{};
//     }
// }





// Three sum problem

import java.util.*;
public class Session10 {
    public static void threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int newTar = target - nums[i];
            int l = i+1;
            int r = n-1;
        
        while(l < r) {
            int csum = nums[l] + nums[r];

            if(csum == newTar) {
                System.out.println(nums[i] + " " + nums[l] + " " + nums[r]);
                l++;
                r--;
            } else if(csum < newTar) {
                l++;
            } else {
                r--;
            }
        }
        }
        
    }

    public static void main(String[] args) {
        int[] nums = {2,4,7,9,12,14};
        int target = 23;
        threeSum(nums, target);
    }
}
        
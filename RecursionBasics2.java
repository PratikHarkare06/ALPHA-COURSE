// // Tiling Problem
// import java.util.*;
// public class RecursionBasics2 {
//     public static int tilingProblem(int n) {
//         // Base Case
//         if(n==0 || n==1){
//             return 1;
//         }
//         // Choice Diagram
//         // Vertical Placement
//         int fnm1 = tilingProblem(n - 1);
//         // Horizontal Placement
//         int fnm2=tilingProblem(n-2);
//         // Total Ways to tile 2*n floor
//         int fn = fnm1+fnm2;
//         return fn;
//     }
//     public static void main(String[] args) {
//         int n = 2;
//         System.out.println(tilingProblem(n));
        
//     }
    
// }






//// Remove Duplicates from a String Problem
// import java.util.*;
// public class RecursionBasics2 {
//     public static void removeDuplicates( String str,int index,StringBuilder newStr, boolean Map []) {
//         if (index == str.length()) { // Base Case
//             System.out.println(newStr);
//             return;
//         }
//         //work
//         char currChar = str.charAt(index);
//         if(Map[currChar - 'a'] == true){
//             //duplicate
//             removeDuplicates(str, index + 1, newStr, Map);
//         } else {
//             //not duplicate
//             Map[currChar - 'a'] = true;
//             removeDuplicates(str, index + 1, newStr.append(currChar), Map);
//         }
//     }

        
    
//     public static void main(String[] args) {
//         String str = "appnnacollege";
//         boolean Map[] = new boolean[26];
//         removeDuplicates(str, 0, new StringBuilder(""), Map);
        
//     }
// }






//// Friends Pairing Problem
// import java.util.*;
// public class RecursionBasics2 {
//     public static int friendsPairing(int n) {
//         // Base Case
//         if(n==1 || n==2){
//             return n;
//         }
//         // Choice Diagram
//         // Single
//         int fnm1 = friendsPairing(n-1);
//         // Pairing
//         int fnm2 = friendsPairing(n-2);
//         int pairWays  = (n-1) * fnm2;

//         // Total Ways
//         int totalpairWays =  fnm1 + pairWays;
//         return totalpairWays;
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         System.out.println(friendsPairing(n));
        
//     }
// }









// Program to print all Binary Strings of length n without consecutive 
import java.util.*;
public class RecursionBasics2 {
    public static void printBinaryStrings(int n,int lastPlace, String str) {
        //Base Case
        if(n==0){ //when no more places are left to fill it print the
            System.out.println(str);
            return;
        }
    //     if (lastPlace == 0){
    //         //Sit at last place is 0
    //         printBinaryStrings(n-1, 0, str.append("0"));
    //         printBinaryStrings(n-1, 1, str.append("1"));
    //     }else{
    //         //Sit at last place is 1
    //         printBinaryStrings(n-1, 0, str.append("0"));
    //     }
    // } 
    // This canbe simplified as:
        printBinaryStrings(n - 1, 0, str + "0"); //you can set 0 at any time
        if(lastPlace == 0){ //you can set 1 only if last place is 0
            printBinaryStrings(n-1, 1, str + "1");
        }
    }
        
    public static void main(String[] args) {
        int n = 3; //length of binary string
        printBinaryStrings(n, 0, new String(""));
        
    }
}

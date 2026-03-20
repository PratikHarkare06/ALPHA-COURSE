

// import java.util.*;
// public class BitManupulation {
//     public static void main(String[] args) {
//         System.out.println((5&6)); // Binary AND 
//         System.out.println((5|6)); // Binary OR
//         System.out.println((5^6)); // Binary XOR
//         System.out.println((~ 5)); // Binary NOT
//         System.out.println((5<<2)); // Binary Left Shift
//         System.out.println((6>>1)); // Binary Right Shift
        
//     }
    
// }



//Java Program to check if a number is odd or Even
// import java.util.*;
// public class BitManupulation {
//     public static void oddOreven(int n) {
//         int bitMask = 1;
//         if((n & bitMask) == 0) {
//             System.out.println("The number is even");
//         } else {
//             System.out.println("The number is odd");
//         }
//     }
//     public static void main(String[] args) {
//         int n = 7;
//         oddOreven(n);
//     }
// }



//Java Program to get the value of ith bit
// import java.util.*;
// public class BitManupulation {
//     public static int getIthBit(int n, int i) {
//         int bitMask = 1 << i;
//         if((n & bitMask) == 0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         int i = 2;
//         System.out.println(getIthBit(n, i));
//     }
// }




//Java Program to set the value of ith bit
// import java.util.*;
// public class BitManupulation {
//     public static int setIthBit(int n, int i) {
//         int bitMask = 1 << i;
//         return n | bitMask;
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         int i = 2;
//         System.out.println(setIthBit(n, i));
//     }
// }




//Java Program to clear the value of ith bit
// import java.util.*;
// public class BitManupulation {
//     public static int clearIthBit(int n, int i) {
//         int bitMask = ~(1 << i);
//         return n & bitMask;
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         int i = 1;
//         System.out.println(clearIthBit(n, i));
//     }
// }







// All Questions of Bit Manupulation at one place
// import java.util.*;

// public class BitManupulation {

//     // Check if a number is odd or even
//     public static void oddOrEven(int n) {
//         int bitMask = 1;
//         if ((n & bitMask) == 0) {
//             System.out.println(n + " is Even");
//         } else {
//             System.out.println(n + " is Odd");
//         }
//     }

//     // Get ith bit
//     public static int getIthBit(int n, int i) {
//         int bitMask = 1 << i;
//         if ((n & bitMask) == 0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }

//     // Set ith bit
//     public static int setIthBit(int n, int i) {
//         int bitMask = 1 << i;
//         return n | bitMask;
//     }

//     // Clear ith bit
//     public static int clearIthBit(int n, int i) {
//         int bitMask = ~(1 << i);
//         return n & bitMask;
//     }
//     public static int updateIthBit(int n, int i, int newBit) {
//         //2nd approach to update ith bit
//         n = clearIthBit(n, i);
//         int bitMask = newBit << i;
//         return n | bitMask;


//         //Simple method to update ith bit
//         // if (newBit == 0) {
//         //     return clearIthBit(n, i);
//         // } else {
//         //     return setIthBit(n, i);
//         // }

        
//     }


//     public static void main(String[] args) {

       
//         int n = 10;
//         int i = 2;
//         int newBit = 1;
        

//         // Test all methods here
//        System.out.println(updateIthBit(10, 2, 1));



//         // System.out.println("Odd or Even:");
//         // oddOrEven(7);

//         // System.out.println("\nGet ith Bit:");
//         // System.out.println("i-th bit = " + getIthBit(n, 2));

//         // System.out.println("\nSet ith Bit:");
//         // System.out.println("After setting bit = " + setIthBit(n, 2));

//         // System.out.println("\nClear ith Bit:");
//         // System.out.println("After clearing bit = " + clearIthBit(n, 1));
//     }
// }














//Clear ith bit
// import java.util.*;
// public class BitManupulation {
//     public static int clearIthBit(int n, int i) {
//         // int bitMask = (-1 << i);
//          int bitMask =(~0 << i);
//         return n & bitMask; 

        
//     }
//     public static void main(String[] args) {
//         int n = 15;
//         int i = 2;
//         System.out.println(clearIthBit(n, i));
        
//     }
// }




//



// // Clear range of bits Problem
// import java.util.*;
// public class BitManupulation {
//     public static int clearRangeBits( int n, int i, int j) {
//         int a =((~0) <<(j+1)) ;
//         int b = (1 << i) - 1;
//         int bitMask = a | b;
//         return n & bitMask;

        
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         int i = 2;
//         int j = 4;
//         System.out.println(clearRangeBits(n, i , j));
        
//     }
// }






// //Problem : Check if a number is power of 2
// import java.util.*;
// public class BitManupulation {
//     public static boolean isPowerOf2( int n) {
//         int bitMask = n & (n-1);
//         if (bitMask == 0) {
//             return true;
//             } else {
//             return false;
//             }
            
        
//     }
//     public static void main(String[] args) {
//         int n = 19;
//         System.out.println(isPowerOf2(n));
        
//     }
// }
        







// ////Problem : Count set bits
// import java.util.*;
// public class BitManupulation {
//     public static int countSetBits( int n) {
//         int count = 0;
//         while(n > 0) {
//             if((n & 1)!=0) {
//                 count++;
//             }
//             n = n >> 1;
            

//         }
//         return count;
        
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println(countSetBits(n));
        
//     }
// }
        









// //Problem : Fast Exponentiation
// import java.util.*;
// public class BitManupulation {
//     public static int fastExponentiation( int a, int n) {
//         int ans = 1;
//         while(n > 0) {
//             //To analyzed the bits
//             if((n & 1) != 0) { //Check LSB bit of n
//                 ans = ans * a;
//             }
//             a = a * a; //Square the number
//             n = n >> 1; //Right shift till n becomes 0
//             }
//             return ans;
        
//     }
//     public static void main(String[] args) {
//         int a = 3;
//         int n = 5;
//         System.out.println(fastExponentiation(a, n));
        
//     }
// }








// Self Study :Modular Exponentiation

import java.util.*;
public class BitManupulation {
    public static int modularExponentiation(int a, int n, int mod) {
        int ans = 1;
        while(n > 0) { //To analyzed the bits
            if((n & 1) != 0) { //Check LSB bit of n
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod; //Square the number and take mod
            n = n >> 1; //Right shift till n becomes 0
            }
            return ans;
        
    }
    public static void main(String[] args) {
        int a = 3; //Base
        int n = 5; //Exponent
        int mod = 11; //Mod
        System.out.println(modularExponentiation(a, n, mod));
        
    }
}
            
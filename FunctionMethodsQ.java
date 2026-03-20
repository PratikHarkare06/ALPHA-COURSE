//Practice Q1: Write a Java method to compute the average of three numbers
// import java.util.*;
// public class FunctionMethodsQ {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int avg = (a+b+c)/3;
//         System.out.println("Avg is : " + avg);
        
//     }
//     public static  void sum (int a, int b, int c){
//         int average  = (a+b+c)/3;
//         System.out.println(average);
        
//     }
    
// }



//Practice Q2:Write a method named isEven that accepts an integer as a parameter and returns true if the number is even, false otherwise.Also write a program to test your method
// import java.util.*;
// public class FunctionMethodsQ {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
       
//         System.out.print("Enter an integer:");
//          int num = sc.nextInt();
//         if (isEven(num)) {
//             System.out.println("The number is even");
//         } else {
//             System.out.println("The number is odd");
//         }
//     }
//     public static boolean isEven(int num) {
//         if (num % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
        
//     }

    
            
// }



//Practice Q3: Write a programe to check if no is palindrome or not 
// import java.util.*;
// public class FunctionMethodsQ{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n;
//         int rev = 0;
//         while (n > 0) { //
//             int rem =n %10; //gives the last digit of num.
//             rev = rev * 10 + rem; //shifts the digits in rev to the left and adds the new last digit.
//             n = n / 10; // removes the last digit from num.

//         }
//         if (temp == rev) { 
//             System.out.println("The number is a palindrome");
//         } else {
//             System.out.println("The number is not a palindrome");
//         }  
    
// }
// }








//Practice Q4:

import java.util.*;
public class FunctionMethodsQ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer:");
        int digits = sc.nextInt();
        System.out.println("The sum of digits is "+ sumDigits(digits));
        
    }
    public static int sumDigits(int n ) {
        int sumOfDigits = 0;
        while (n > 0) {
            int rem = n % 10; // to get last digit
            sumOfDigits = sumOfDigits + rem;
            n = n / 10; // to remove last digit
        }
        return sumOfDigits;
        
    }
        
    
}


        
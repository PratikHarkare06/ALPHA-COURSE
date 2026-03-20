// import java.util.Scanner;

// public class FunctionsMethods {
   
//         public static int calculateSum(int num1, int num2) {  
//         int sum = num1 + num2;
//         return sum;
        

//         }
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int sum = calculateSum(a, b);
//             System.out.println("Sum is : " + sum);
//         }
 
        
//     }
    



// Call by value and call by reference

// import java.util.Scanner;
// public class FunctionsMethods {
//     public static void main(String[] args) {
//         //swap - exchange the values
//         int  a= 10;
//         int  b= 20;

//         //Swap
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
        
//     } 
        
//     }


// Swap using functions

// call by value

// import java.util.Scanner;
// public class FunctionsMethods {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         swap(a, b);
         
       
        
//     } 
//     public static void swap(int a, int b){
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
        
//     }

    
// }
        
    
    


// Product of 2 nos 
// import java.util.Scanner;

// public class FunctionsMethods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = multiply(a, b);
    
 
//     }
//     public static int  multiply(int a, int b){
//         int product = a*b;
//         System.out.println("Product is : " + product);
//         return product;
        
//     }

// }


// Factorial of a number
// import java.util.*;
// public class FunctionsMethods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int factorial = factorial(a);
//         System.out.println("Factorial is : " + factorial);
        
//     }

//     public static int  factorial(int a){ 
//         int factorial = 1;
//         for(int i=1;i<=a;i++){
//             factorial = factorial*i;
//         }
//         return factorial;
        
//     }
// }





//Calculate Binomial Coefficient
// import java.util.*;
// public class FunctionsMethods {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         int binomial = binomialCoefficient(n, r);
//         System.out.println("Binomial Coefficient is : " + binomial);
//     }

//     public static int factorial(int num) {
//         int fact = 1;
//         for (int i = 1; i <= num; i++) {
//             fact *= i;
//         }
//         return fact;
//     }
//     public static int binomialCoefficient(int n, int r){
//         int n_fact = factorial(n);
//         int r_fact = factorial(r);
//         int n_r_fact = factorial(n - r);

//         int binomialCoefficient = n_fact / (r_fact * n_r_fact);

//         return  binomialCoefficient;
//     }
// }




//Function overloading


// import java.util.*;
// public class FunctionsMethods {
//     public static void main(String[] args) {
//         System.out.println(sum(10, 20));
//         System.out.println(sum(10, 20, 30));
//     }
//     // function to calculate sum of 2 nos
//     public static int sum(int a, int b){ 
//         return a+b;
        
//     }
//     //Function to calculate sum of 3 nos
//     public static int sum(int a, int b, int c){ 
//         return a+b+c;
        
//     }
// }



//Function overloading using differnt datatypes
// import java.util.*;
// public class FunctionsMethods {

//     public static int sum(int a, int b) {
//         return a+b;
        
//     }
//     public static float sum(float a, float b) {
//         return a+b;

        
//     }
    
//     public static void main(String[] args) {
//         System.out.println(sum(10, 20));
//         System.out.println(sum(10.0f, 20.0f));
        
//     }
// }






//Checks if a number is prime(normal approach)
// import java.util.*;
// public class FunctionsMethods {
//     public static boolean isPrime(int n) {
//         boolean isPrime = true;

//         //corner cases 
//         if(n==2){
//             return true;
            
//         }
//         for (int i = 2; i <= n-1; i++) {
//             if (n % i == 0) { // Completely divisible
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(2));
    
        
//     }



// }

        





// //Optimized approach(Prime no using sqrt)
// import java.util.*;
// public class FunctionsMethods {
//     public static boolean isPrime(int n) {
//         //corner cases
//         if(n==2){
//             return true;
            
//         }
//         boolean isPrime = true;

//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) { // Completely divisible
//                 return false;
//             }
//         }
//         return true;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(4));
    
        
//     }
// }





//Primes in range
// import java.util.*;
// public class FunctionsMethods {
//     public static void primesInRange(int n){ 
//         int count = 0;
//         for(int i = 2; i <= n; i++) {
//             if(isPrime(i)) { 
//                 System.out.print(i + " ");
//                 count++;
//             }
//         }
//         System.out.println();
//     }
    
//     // Added: Prime checking method
//     public static boolean isPrime(int n) {
//         if (n < 2) return false;
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) return false;
//         }
//         return true;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         primesInRange(n);
//     }
// }





//Binary To Decimal
// import java.util.*;
// public class FunctionsMethods {
//     public static void binToDec(int binNumber) {
//         int myNumber = binNumber;
//         int power = 0;
//         int decNum = 0;
//         while(binNumber > 0) {
//             int lastDigit= binNumber % 10;
//             decNum = decNum + lastDigit * (int)Math.pow(2, power);
//             binNumber = binNumber / 10;
//             power++;
//         }
//         System.out.println("Decimal of  " + myNumber + " is " + decNum);


//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int binNumber = sc.nextInt();
//         binToDec(binNumber);
//     }
// }




//Decimal To Binary
// import java.util.*;
// public class FunctionsMethods {
//     public static void decToBin(int n) {
//         int myNum = n;
//         int power = 0;
//         int binNumber = 0;
//         while(n > 0) {
//             int rem = n % 2;
//             binNumber = binNumber + rem * (int)Math.pow(10, power);
//             n = n / 2;
//             power++;
//         }
//         System.out.println("Binary of " + myNum + " is " + binNumber);        
//     }
    
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         decToBin(n);
        

        
//     }
// }




//Method Scope
// import java.util.*;
// public class FunctionsMethods {
//     public static void main(String[] args) {
//         // System.out.println(s);  // this will give error as s is not defined
//         int s =24;
//         System.out.println(s); // this will print 24sot
       

//     }
    // public static void printS(){
    //     int s = 45;
        
    // }
    // public static void main(String[] args) {
    //     System.out.println(s); // This will give error as s is not defined in main method 
    // }

    

    // // Block Scope 
    // import java.util.*;
    // public class FunctionsMethods {
    //     public static void main(String[] args) {
    //        {
    //         int s = 45;
    //         System.out.println(s);// This will print 45

    //        } 
    //        System.out.println(s); // This will give error as s is not defined in main method and we cant access s outside 
    //     }
    // }



// Hollow Rectangle Pattern
// import java.util.*;
// public class Session7 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter number of rows: ");
//         int rows = scanner.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = scanner.nextInt();
        
//         // Printing hollow rectangle pattern
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= cols; j++) {
//                 // Print * for first and last row, and for first and last column
//                 if (i == 1 || i == rows || j == 1 || j == cols) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  "); // Print spaces for hollow part
//                 }
//             }
//             System.out.println(); // Move to next line after each row
//         }
        
//         scanner.close();
//     }
// }




//Takes 3 input from user and return the sum of 3 numbers
//As per requirement you can define an function which takes 3 numbers as input parameters and return the sum of 3 numbers
// import java.util.*;
// public class Session7 {
//     public static void sum(int a,int b,int c){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number 1:");
//         a = sc.nextInt();
//         System.out.println("Enter the number 2:");
//         b = sc.nextInt();
//         System.out.println("Enter the number 3:");
//         c = sc.nextInt();
        
//          int result = a + b + c;
//          System.out.println("The sum of 3 number is " + result);
//     }
    
        
    
//     public static void main(String[] args) {

//         sum(1,2,3);
        
      
        
//     }
// }




// What will be the output  of following code?
import java.util.*;
public class Session7 {
    public static void sum(int a){ 
        a+=10; //a=25
        System.out.println("The value of a inside function is "+a); //a=25
    }
    public static void main(String[] args) {
        int a = 15;
        System.out.println("The value of a inside main is "+a); //a=15
        sum(a);
        System.out.println("The value of a outside function is "+a); //a=15

    }
}
// Output will be: 15,25,15



//Absolutes expects integer input from user and return the absolute value
//Absolute function  converts negative number to positive number
//Question1:In a program,input 3 numbers:A,B and C. You have to print the  average of these numbers.
//Hint: Average of N numbers is sum of those numbers divided by N

// import java.util.*;
// public class PracticeQs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int  A= sc.nextInt();
//         int  B= sc.nextInt();
//         int  C= sc.nextInt();
//         int Avg = (A+B+C)/3;
//         System.out.println("The average of three numbers is: " + Avg);
//     }
// }


//Question2:In a  program,input the side of a square .You have to print the area of the square.
//Hint: Area of square is side*side
// import java.util.*;
// public class PracticeQs {
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         int side = sc.nextInt();
//         int area = side * side;
//         System.out.println("The area of sqare is : " + area);
//     }
// }


//Question3:Enter cost of 3 items from the user (using float datatype)-a pencil,a  pen and an eraser. You have to output the total cost of the items back to the user as their bill.
//Hint: You can also try  adding 18% GST to the bill.

// import java.util.*;
// public class PracticeQs {
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         float pencil= sc.nextFloat();
//         float pen= sc.nextFloat();
//         float eraser= sc.nextFloat();


//         float totalCost = pencil + pen + eraser;
// 18 percent GST add to the total cost
//

//         totalCost = totalCost + (0.18f * totalCost); // Adding
        

        
//         System.out.println("The total cost of the items is: " + totalCost);
//     }
// }


//Question4:What will be the output of following Java code
//Hint : Look at larger data types
// import java.util.*;
// public class PracticeQs {
//     public static void main(String []args){
//         byte b= 4;
//         char c ='a';
//         short s =512;
//         int i = 1000;
//         float f = 3.14f;
//         double d =99.9954;

//          double result = (f*b)+(i%c)-(d*s);
//         System.out.println(result);// Output: -50631.8594 which is of double type as its a larger data type
//     }
// }


//Question5(advanced):Will the following statement give error or not in Java? If yes,
import java.util.*;
public class PracticeQs {
    public static void main(String []args){

         int $= 24;
         System.err.println($);
         }
    }
    //In Java, identifiers (variable names, method names, etc.) can use:

// Letters (a–z, A–Z)

// Digits (0–9) — but not as the first character

// Underscore (_)

// Dollar sign ($)

// So int $ = 24; is valid.
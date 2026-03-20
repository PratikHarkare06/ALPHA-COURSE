// import java.util.*;
// public class conditional {
//     public static void main(String[] args) {
//         int age = 17;
//         if (age >= 18) {
//             System.out.println("You are eligible to vote");
//         }
//         if (age > 13 && age <18) {
//             System.out.println("You are a teenager");
//         } else {
//             System.out.println("You are not eligible to vote");
//         }
//     }
// }




//Print the largest of 2 numbers
// import java.util.*;
// public class conditional {
//     public static void main(String[] args) {
//         int A= 1;
//         int B = 3;
//         if (A > B) {
//             System.out.println(" A is the largest of 2");
//         } else {
//             System.out.println(" B is the largest of 2");
//         }
//     }
// }





// // Print if a number is even or odd
// import java.util.*;
// public class conditional {
//     public static void main(String[] args) {
//         // int num = 7;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         if (num % 2 == 0) {
//             System.out.println("The number is even");
//         } else {
//             System.out.println("The number is odd");
//         }
//     }
// }




//Income tax calculator
// import java.util.*;
// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your income: ");
//         int income = sc.nextInt();
//         int tax ;
//         if (income  < 500000) {
//             tax = 0;
//             } else if (income >= 500000 && income < 1000000) {
//                 tax = (int) (0.2 * income);
//                 } 
//                 else {
//                     tax = (int) (0.3 * income);
//                     }
//         System.out.println("The tax is: " + tax);
//     }
// }
                
          



// Print the largest of 3 numbers
// import java.util.*;
// public class conditional {
//     public static void main(String[] args) {
//         int A = 1, B = 3, C = 6;
//         if (A >= B && A >= C) {
//             System.out.println("A is the largest of 3");
//         } else if (B >= A && B >= C) {
//             System.out.println("B is the largest of 3");
//         } else {
//             System.out.println("C is the largest of 3");
//         }
//     }
// }





// Ternary operator
// import java.util.*;
// public class conditional {
//     public static void main(String[] args) {
//         int number = 7;
//         String type = (number % 2 == 0) ? "Even" :  "Odd";
//         System.out.println(type);
//     }
// }



// Student is pass or fail
// import java.util.*;
//   public class conditional {
//         public static void main(String[] args) {
//             int marks = 88;
        
//             String result = (marks >= 33) ? "Pass" : "Fail";
//             System.out.println(result);
//         }
//     }


// Switch Statement
// import java.util.*;
//     public class conditional {
//         public static void main(String[] args) {
//             int number = 6;
//             switch (number) {
//                 case 1:System.out.println("Samosa");
//                 break;
//                 case 2:System.out.println("Burger");
//                 break;
//                 case 3:System.out.println("Pizza");
//                 break;
//                 case 4:System.out.println("Pasta");
//                 break;
//                 default:System.out.println("Invalid choice");
//             }
//         }
//     }




// Calculator using switch
import java.util.*;
    public class conditional {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1= sc.nextInt();
            System.out.print("Enter second number: ");
            int num2= sc.nextInt();
            System.out.print("Enter an operator (+, -, *, /,%): ");
            char operator = sc.next().charAt(0);
            int result;
            switch (operator) {
                case '+': result = num1 + num2;
                break;
                case '-': result = num1 - num2;
                break;
                case '*': result = num1 * num2;
                break;
                case '/': result = num1 / num2;
                break;
                case '%': result = num1 % num2;
                break;

                default: System.out.println("Invalid operator");
                return;
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            
            
            }
        }
    

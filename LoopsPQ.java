
// 
//Practice Question 1:Find  How many times "Hello World" will be printed?
import java.util.*;
public class LoopsPQ {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Helo World");
             i+=2;  }
    }
             
}
// Hello will print 2 times




// import java.util.*;
// public class LoopsPQ {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//           int number ;
//           int evenSum=0;
//             int oddSum=0;
//             int choice;
//             do{
//                 System.out.print("Enter a number:");
//                 number = sc.nextInt();
//                 if(number%2==0){
//                     evenSum+=number;
//                 }
//                 else{
//                     oddSum+=number;
//                 }
//                 System.out.print("Do you want to continue? (1 for yes/0 for no):");
//                 choice = sc.nextInt();
//             }while(choice==1);
//             System.out.println("Sum of Even Numbers: "+evenSum);
//             System.out.println("Sum of Odd Numbers: "+oddSum);

//         }



    

// }



// Practice Question 3:Find Factorial of a user input number
// import java.util.*;
// public class LoopsPQ {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//             int n;
//         System.out.print("Enter Any Positive Integer:");
//         n = sc.nextInt();
    
//         int factorial = 1;
//         for(int i=1;i<=n;i++){
//             factorial = factorial*i;
//       }
//             System.out.println("Factorial of "+n+" is: "+factorial);
            

//     }
// }




//Practice Question 4:Print multiplication table of a user input number
// import java.util.*;
// public class LoopsPQ {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter  a number:");
//         int n = sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(n+" x "+i+" = "+n*i);
//         }
//     }
// }


// Practice Question 5:What is wrong in the following code?
// import java.util.*;
// public class LoopsPQ {
//     public static void main(String[] args) {
//         for(int i=0;i<=5;i++){
//             System.out.println("i = "+i);
//     }

//     System.out.println("i after the loop = "+ i); 
// }
// }
// The variable 'i' is declared within the for loop, so it is not accessible outside the loop. To fix this, declare 'i' before the loop.

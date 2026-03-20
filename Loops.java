
// While Loop Example

// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         int counter =0;
//         while(counter <=100){
//             System.out.println("Hello World");
//             counter++;
        
//     }
    
// }
// }



//Print numbers from 1 to 10 using while loop
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         int numbers =1;
//         while(numbers <=10){
//             System.out.println(numbers);
//             numbers++;
//         }
      
//         }
//     }


//Print numbers from 1 to  N using while loop

// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the range value: ");
//         int range = sc.nextInt();
         

//         int counter =1;
      
//         while(counter <=range){
//             System.out.print(counter + " ");
//             counter++;
//         }

//         System.out.println();

//     }
// }




//Print the sum of first N natural numbers using while loop

// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the range value: ");
//         int range = sc.nextInt();
//         int sum = 0;
//         int counter =1;
         

//         while(counter <=range){
//              sum = sum + counter;
//             counter++;
//         }
//         System.out.println("The sum of first " + range + " numbers is: " + sum);
//     }
// }




// Print "Hello World" 10 times using for loop

// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         for(int i=1; i<=10; i++){
//             System.out.println("Hello World");
//         }
//     }
// }




// Print the SQUARE Pattern
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
    //     for(int i=1; i<=4; i++){
    //         for(int j=1; j<=4; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    // OR
    // for(int line=1; line<=4; line++){
    //     System.out.println("* * * * ");
        

    //  }
//     int line =1;

//     while(line <=4){
//         System.out.println("* * * * ");
//         line++;
//     }
//     }
// }



//Print the reverse of a number
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         int n = 10899;
//         while (n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n / 10;

//         }
//         System.out.println();
            
//         }
// }





//Reverse the number and store it in a variable
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         int rev =0;
//         int n = 10899;
//         while(n > 0) {
//             int lastDigit = n % 10;
//               n = n / 10;
//              rev = rev * 10 + lastDigit;
            


//         }
//         System.out.println(rev);
//     }
// }




//Print "Hello World" 10 times using do while loop
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         int  counter =1;
//         do{
//             System.out.println("Hello World");
//             counter++;
//         }while(counter <=10);
        
//         }
//     }





//Break Statement
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         // int num=1;
        // do {
        //     System.out.println(num);
        //     if(num==3){
        //         break;
        //     }
        //     num++;
        // }while(num<=5);
        
        // using for loop
    //     for(int i=1; i<=5; i++){
    //         if(i==3){
                  

    //             break;
             

    //         }


    //         System.out.println(i);
    //     }
        
    // }
    // }




    //Question: Print numbers as many as user wants until user enters a multiple of 10 use break statement
    // import java.util.*;
    // public class Loops {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
            // for(int i=1; i>0; i++){
            //     System.out.print("Enter a number: ");
            //     int num = sc.nextInt();
            //     if(num % 10 == 0){
            //         break;
            //     }
            // }

    //         do{
    //             System.out.print("Enter a number: ");
    //             int num = sc.nextInt();
    //             if(num % 10 == 0){
    //                 break;
    //             }
    //         }while(true);

    //     }
    // }



    //Continue Statement
    // import java.util.*;
    // public class Loops {
    //     public static void main(String[] args) {
    //         for(int i=1; i<=5; i++){
    //             if(i==3){
    //                 continue;
    //             }
    //             System.out.println(i);
    //         }
    //     }
    // }


    //Question: Print numbers as many as user wants until user enters a multiple of 10 use continue statement
    // import java.util.*;

    // public class Loops {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         System.out.print("Enter the  number : ");
    //         do{
    //             int num = sc.nextInt();
    //             if (num % 10 == 0) {
    //                 continue;
    //             }
    //             System.out.println("num was  : " + num);
    //         } while (true);
    //     }
    // }



    import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
       

        if (n == 2) {
            System.out.println("The number is prime");
        } else {
             boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }
    }
}
// import java.util.*;
// public class Session4 {
//     public static void main(String[] args) {
        // Using while loop
        // int i = 0; 
        // int j =10;
        // while( i < j){
        //     System.out.print(i);
        //     System.out.println(j);
        //     i++;
        //     j--;


        // Using for loop
//         for (int i = 0, j = 10; i < 10 && j > 0; i++, j--) {
//             System.out.print(i);
//             System.out.println(j);

            



            
          

           
            
            
//         }
        
        
//     }
// }






//Sum of odd and even number entered by user
// import java.util.*;
// public class Session4 {
    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number  ;
//         int choice ;
       
//         int evenSum= 0;
//         int oddSum = 0;

//         do{
//             System.out.println("Enter the number");
//             number = sc.nextInt();
//             if(number % 2 == 0){
//                 evenSum = evenSum + number;
//             }
//             else{
//                 oddSum = oddSum + number;
//             }
//             System.out.println("Do you want to continue");
//             choice = sc.nextInt();

//         }while(choice == 1);
//         System.out.println("The sum of even number is "+evenSum);
//         System.out.println("The sum of odd number is "+oddSum);
//         }
//     }

        
//     // we use do while loop when we want to execute the loop at least once




// Factorial of a number
// import java.util.*;
// public class Session4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int factorial = 1;

//         for (int i = 1; i <= number; i++) {
//             factorial = factorial * i;
//         }
//         System.out.println("The factorial of "+number+" is "+factorial);
        
//     }
    
// }



//Table print
// import java.util.*;
// public class Session4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int number = sc.nextInt();
//         for(int i = 1; i <=10; i++){
//            System.out.println(number+" * "+i+" = "+(number*i));

            
//             }
//             System.out.println();
//         }
//     }

            
            

// Prime no
// import java.util.*;
// public class Session4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the  positive integer :");
//         int number = sc.nextInt();
       
            // for(int i = 2; i < number; i++){
            //     if(number % i == 0){
            //         System.out.println("The number is not prime");
            //         break;
            //     }
            //     else{
            //         System.out.println("The number is prime");
            //     }

            // }

            //Optimized code

//             if(number==2){
//                 System.out.println("The number is prime");

//             }
//             boolean isPrime = true;
//             for(int i = 2; i < Math.sqrt(number); i++){
//                 if(number % i == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 System.out.println("The number is prime");
//             }
//             else{
//                 System.out.println("The number is not prime");
//             }
        
//     }
// }





// 
import java.util.*;
public class Session4 {
    public static void main(String[] args) {
     int a=1;
     int b =1;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = sc.nextInt();
     for(int i = 3; i <= n; i++){
        int temp = a;
        a = b;
        b = temp + b;
     }
     System.out.println(a);
    }
}
        
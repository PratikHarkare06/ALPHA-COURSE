////Inverted and Rotated Half Pyramid(samrat bhaiya pattern)

// import java.util.*;
// public class Session8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int total_no_of_lines=n;

//         int stars = 1;
//         int spaces = n - 1;

//         int current_no_of_line = 1;
//         while (current_no_of_line <= total_no_of_lines) {

//             // Print leading spaces
//             for (int i = 1; i<= spaces; i++) {
//                 System.out.print(" ");
//             }

//             // Print stars for the current line
//             for (int i = 1; i<=stars; i++) {
//                 System.out.print("*");
//             }

//             // Move to the next line
//             System.out.println();
            
//             spaces--;
//             stars ++;
//             current_no_of_line++;

        
//         }
//     }
// }




//(Apna College pattern) Inverted rotated half pyramid
// import java.util.*;
// public class Session8 {
//     public static void main(String[] args) {
//     int n = 5; // Number of rows for the pattern
//     for(int i =1;i<=n;i++){
//             //Spaces
//             for(int j= 1; j<=n-i;j++){

//                  System.out.print(" ");
//             }
//                 //Stars

//                 for(int j=1;j<=i;j++){
//                     System.out.print("*");

//                 }
//                 System.out.println();

//             }
// }
// }




//  
// import java.util.*;
// public class Session8{
//     public static void main(String[] args) {
//     int n = 5; // Number of rows for the pattern
//     for(int i =1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(" *");
//         }
//         System.out.println();
//     }
// }
// }





// import java.util.*;
// public class Session8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int total_no_of_lines=n;

//         int stars = 1;
//         int spaces = n - 1;

//         int current_no_of_line = 1;
//         while (current_no_of_line <= total_no_of_lines) {

            

//             // Print stars for the current line
//             for (int i = 1; i<=stars; i++) {
//                 System.out.print("*");
//             }

//             // Print leading spaces
//             for (int i = 1; i<= spaces; i++) {
//                 System.out.print(" ");
//             }
//             // Move to the next line
//             System.out.println();
            
//             spaces--;
//             stars ++;
//             current_no_of_line++;
        
//         }
//     }
// }





//
// import java.util.*;
// public class Session8 {
//     public static void main(String[] args) {
//         int n = 5; // Number of rows for the pattern
//         for (int i =1;i<=n;i++){
//             for(int j=1;j<=n-1;j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }






//
// import java.util.*;

// public class Session8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int total_no_of_lines = n;
//         int stars = n;
//         int spaces = 0;
//         int current_no_of_line = 1;

//         while (current_no_of_line <= total_no_of_lines) {

//             // Print leading spaces
//             for (int i = 1; i <= spaces; i++) {
//                 System.out.print(" ");
//             }

//             // Print stars for the current line
//             for (int i = 1; i <= stars; i++) {
//                 System.out.print("*");
//             }

//             // Move to the next line
//             System.out.println();

//             // Update values for next iteration
//             stars--;
//             spaces++;
//             current_no_of_line++;
//         }

       
//     }
// }




//
// import java.util.*;
// public class Session8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//        int total_no_of_lines =2*n-1;
//          int stars =1;
//          int spaces = n-1;
//          int current_no_of_line = 1;

//          while (current_no_of_line <= total_no_of_lines) {
//             //Spaces
//             for (int i = 1; i<= spaces; i++) {
//                 System.out.print(" ");
//             }

//             // Print stars for the current line
//             for( int i = 1; i<=stars; i++) {
//                 System.out.print("*");
//             }
//             // Move to the next line

//             if(current_no_of_line < n){
//                 stars = stars+2;
//                 spaces--;
//             }else{
//                 stars = stars -2;
//                 spaces++;
//             }
//             System.out.println();
//             current_no_of_line++;

//         }
//     }
// }

                
   

//
import java.util.*;
public class Session8 {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                }
            System.out.println();
        } 

        //Lower Half
        for(int i =n;i>=1;i--){ //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                }
            for(int j=1;j<=2*(n-i);j++){. //spaces
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){ //stars
                System.out.print("* ");
                }
            System.out.println();
        }

    }
}

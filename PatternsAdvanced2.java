//Hollow Rectangle Pattern
// import java.util.*;
// public class PatternsAdvanced2 {
//     public static void hollow_rectangle(int toRows, int toCols) {
//         //Outer loop
//         for(int rows=1;rows<=toRows;rows++){
//             //Inner Column
//             for(int cols=1;cols<=toCols;cols++){ // cell - (i,j) i.e. rows and cols
//                 //Boundary Condition
//                 if(rows == 1 || rows == toRows || cols == 1 || cols == toCols){
//                     //
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         hollow_rectangle(5,4);
        
//     }
    
// }





//Inverted and Rotated Half Pyramid
import java.util.*;
public class PatternsAdvanced2 {
    public static void rotated_inverted_half_pyramid(int n) {
        //Outer loop
        
        for(int i =1;i<=n;i++){
            //Spaces
            for(int j= 1; j<=n-i;j++){

                 System.out.print(" ");
            }
                //Stars

                for(int j=1;j<=i;j++){
                    System.out.print("*");

                }
                System.out.println();

            }
           


    }
    public static void main(String[] args) {
        rotated_inverted_half_pyramid(4);
        
    }
    
 }





//Inverted Half Pyramid with numbers Pattern

// import java.util.*;
// public class PatternsAdvanced2{
  
        
//         public static void inverted_half_pyramid_with_numbers(int n){
//             //Outer loop
//             for(int i=1;i<=n;i++){
//                 //Inner loop
//                 for(int j=1;j<=n-i+1;j++){ // j value is printed
//                     System.out.print(j +" ");
//                 }
//                 System.out.println();
//             }
//         }
//         public static void main(String[] args) {
//             inverted_half_pyramid_with_numbers(5);
//         }
//     }





// //Floyds Triangle
// import java.util.*;
// public class PatternsAdvanced2{
  
        
//         public static void floyds_triangle(int n){
//             int counter = 1;
//             //Outer loop
//             for(int i=1;i<=n;i++){
//                 //Inner loop - how many  times counter is printed
//                 for(int j=1;j<=i;j++){ 
//                     System.out.print(counter +" ");
//                     counter++;
//                 }
//                 System.out.println();
//             }
//         }
//         public static void main(String[] args) {
//             floyds_triangle(5);
//         }
//     }

            
        



//Zero One Triangle Pattern
// import java.util.*;
// public class PatternsAdvanced2{
  
        
//         public static void zero_one_triangle(int n){
//             //Outer loop
//             for(int i=1;i<=n;i++){
//                 //Inner loop 
//                 for(int j=1;j<=i;j++){
//                     if((i+j)%2==0){
//                         System.out.print("1 "); // Sum of i and j is even print 1
//                     }
//                     else{
//                         System.out.print("0 ");// Sum of i and j is odd print 0
//                     }
//                 }
//                 System.out.println();
//             }
//             }
//             public static void main(String[] args) {
//                 zero_one_triangle(5);
//             }
//         }
            




// //Butterfly Pattern
// import java.util.*;
// public class PatternsAdvanced2{
  
        
//         public static void butterfly_pattern(int n){
//             //Outer loop
//             for(int i=1;i<=n;i++){
//                 //Stars - i
//                 for(int j=1;j<=i;j++){
//                     System.out.print("* ");
//                 }


//                 //Spaces - 2*(n-i)
//                 for(int j=1;j<=2*(n-i);j++){
//                     System.out.print("  ");
//                 }


//                 //Stars - i
//                 for(int j=1;j<=i;j++){
//                     System.out.print("* ");
//                 }
//                 System.out.println();
//                 }


//                 //Inverted Butterfly Pattern
//                 for(int i=n;i>=1;i--){
//                     //Stars - i
//                     for(int j=1;j<=i;j++){
//                         System.out.print("* ");
//                     }
    
    
//                     //Spaces - 2*(n-i)
//                     for(int j=1;j<=2*(n-i);j++){
//                         System.out.print("  ");
//                     }
    
    
//                     //Stars - i
//                     for(int j=1;j<=i;j++){
//                         System.out.print("* ");
//                     }
//                     System.out.println();
//                     }
//                 }
//                 public static void main(String[] args) {
//                     butterfly_pattern(3);
//                 }
            
                
//             }





// //Solid Rhombus
// import java.util.*;
// public class PatternsAdvanced2 {
//     public static void solid_rhombus(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         solid_rhombus(3);
//     }
// }
        



// //Hollow Rhombus
// import java.util.*;
// public class PatternsAdvanced2 {
//     public static void hollow_rhombus(int n){
//         for(int i=1;i<=n;i++){
//             //Outer loop - printing spaces
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //Hollow Rhombus/Rectangle
//             for(int j=1;j<=n;j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//         hollow_rhombus(3);
        
//     }


// }





//Diamond Pattern
// import java.util.*;
// public class PatternsAdvanced2{
//     public static void diamond_pattern(int n){ 
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //Inverted Diamond Pattern
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         diamond_pattern(3);
        
//     }
// }
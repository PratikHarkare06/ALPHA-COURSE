// SQUARE PATTERN
// import java.util.*;
// public class Session5 {
//     public static void main(String[] args) {
//         int n=4;
//         for(int i = 1;i<=n;i++){ // This is outer loop and prints the number of rows 
//             for(int j = 1;j<=n;j++){// This is inner loop and prints the number of columns
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }


//Half triangle pattern
import java.util.*;
public class Session5 {
    public static void main(String[] args) {
        int n=4;
        for(int i =1;i<=n;i++){ //i =line
            for(int j=1;j<=i;j++){ //Print stars as the line number
                System.out.print("*");
            }
            System.out.println();
        }
        }

    }





    // //Inverted Half triangle Pattern
    // import java.util.*;
    // public class Session5 {
    //     public static void main(String[] args) {
    //         int n=4;
    //         for(int i=1;i<=n;i++){
    //             for(int j=1;j<=n-i+1;j++){
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }
    
                


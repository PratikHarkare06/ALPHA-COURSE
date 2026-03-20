// Star Pattern(using nested for loop)
// import java.util.*;
// public class Patterns1 {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


//Inverted Star Pattern(using nested for loop)
// import java.util.*;
// public class Patterns1 {
//     public static void main(String[] args) {
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 2nd approach


//         int n = 8;
//         for(int line=1;line<=n;line++){
//             for(int star=1;star<=n-line+1;star++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



//Half Pyramid Pattern(using nested for loop)
// import java.util.*;
// public class Patterns1 {
//     public static void main(String[] args) {
//         int n = 6;
//         for(int line=1;line<=n;line++){
//             for(int number=1;number<=line;number++){
//                 System.out.print(number+ " ");
//             }
//             System.out.println();
//         }
     
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){

        //         System.out.print(j+ " " );
        //     }
        //     System.out.println();
//         // }
//     }
// }



//
import java.util.*;
public class Patterns1 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        //Outer loop
        for(int line=1;line<=n;line++){
            //Inner loop
            for(int chars=1;chars<=line;chars++){
           
                System.out.print(ch);
                ch++;
            
            }
            System.out.println();
        }
    }
}
// import java.util.*;
// public class Session6 {
//     public static String greetingCard(String FirstName, String LastName){ //This is a function in java(camelCase)
//         System.out.println("Happy Birthday " + FirstName+" " + LastName);
//         return "Good Day"; // we can use return value or not its upto us we can store  the first name , last name  in an variable and print and return statement also can be used




        
//     }

//     public static void main(String[] args) {
//         greetingCard("Rohit", "Rathore");
        
        
//     }
// }




// 
// import java.util.*;
// public class Session6 {
//     public static void main(String[] args) {
//         int result = Sum(10,20);
//         System.out.println(result);
     
//     }
//     public static int Sum(int a, int b){
//         int result = a+b;
//         return result;
//     }

// }




//What will be the output of this code
// import java.util.*;
// public class Session6 {
//     public static void Swap(int a, int b){
//         System.out.println(a + " " + b);
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println(a + " " + b);
       
        
//     }
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         System.out.println(a + " " + b);
//         Swap(a,b);
//         System.out.println(a + " " + b);
//     }
// }
//Output will be
// 10 20
// 10 20
// 20 10
// 10 20





//
import java.util.*;
public class Session6 {
    public static void main(String[] args) {
        int  n =300;
        int rev =0;
        int temp = n;
        while(temp!=0){
            int lastdigit = temp % 10; //To find last digit we have to find remainder and for that we use modulus operator
            rev = rev * 10 + lastdigit;//To shift the last digit
            temp = temp / 10; //To remove last digit we have to do integer division by 10
        }
        if(rev == n){
            System.out.println("Palindrome");
        }else{
                System.out.println("Not Palindrome");
            }
        }
    }


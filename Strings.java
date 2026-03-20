// import java.util.*;
// public class Strings {
//     public static void printLatters(String str) {
//         for(int i=0;i<str.length();i++){
//             System.out.print(str.charAt(i)+" ");
            
//         }
//         System.out.println();
        
//     }
//     public static void main(String[] args) {

//         char arr []= {'a','b','c','d',};
//         //Declarion types of Strings
//         String str1 = "abcd";
//         String str2 = new String("wxyz");


//         // Strings are IMMUTABLE
//         //Input / Output in Strings
//         // Scanner sc = new Scanner(System.in);
//         // String name;
//         // name = sc.nextLine();
//         // System.out.println(name);


//         // String Length
//         // String fullName = "Sachin Tendulkar";
//         // System.out.println(fullName.length());



//         // String Concatenation
//         String firstName = "Pratik";
//         String lastName = "Harkare";
//         String fullName = firstName + " " + lastName;


//         //.charAt() method  is used to get the character at a specific index in a String
//         // System.out.println(fullName.charAt(0));

//         printLatters(fullName);



        

        
//     }
    
// }










//Java Program to check if a String is a Palindrome
// import java.util.*;
// public class Strings {
//     public static boolean isPalindrome( String str)  {
//         for(int i =0;i<str.length()/2;i++){
//             int n = str.length();
//             //If true then it is a palindrome else false
//             if(str.charAt(i)!=str.charAt(n-i-1)){
//                 return false;
                
//             }

//         }
//         return true;
        
//     }

//     public static void main(String[] args) {
//         String str = "racicar";
//         System.out.println(isPalindrome(str));
            
//     }
    
// }





// Java Program to find the shortest path in a
// import java.util.*;
// public class Strings{
//     public static float getShortestPath(String path){
//         int x=0;
//         int y=0;
//         for(int i=0;i<path.length();i++){
//             char dir =path.charAt(i);
//             if(dir=='N'){
//                 y++;
//             }
//             else if(dir=='S'){
//                 y--;
//             }
//             else if(dir=='E'){
//                 x++;
//             }
//             else if(dir=='W'){
//                 x--;
//             }
//         }
//         int X2 = x*x;
//         int Y2= y*y;
//         return(float)Math .sqrt(X2+Y2); // Type casting to float because sqrt returns double


        
//     }
//     public static void main(String[] args) {
//         String path = "WNEENESENNN";
//         System.out.println(getShortestPath(path));
        
//     }
// }








//String Function Compare 
// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         String str1 = "Hello";
//         String str2 = "Hello";
//         String str3 = new String("Hello");

//        // // You shouldnt use == operator to compare Strings based on the value instead use .equals method
        
//         // if(str1==str2){
//         //     System.out.println("Equal");
//         // }
//         // else{
//         //     System.out.println("Not Equal");
//         // }
//         // if(str1==str3){
//         //     System.out.println("Equal");
//         // }
//         // else{
//         //     System.out.println("Not Equal");
//         // }
//         if(str1.equals(str2)){
//             System.out.println("Equal");
//         }
//         else{
//             System.out.println("Not Equal");
//         }
//         if(str1.equals(str3)){
//             System.out.println("Equal");
//         }
//         else{
//             System.out.println("Not Equal");
//         }
        
//     }
    
// }
        








///// Substring Functions in Strings
// import java.util.*;
// public class Strings {
//     public static  String substring(String str,int si,int ei){
//         String substr = "";
//         for(int i=si;i<ei;i++){
//             substr+=str.charAt(i);  //Concatenation
//         }
//         return substr;
        
//     }
//     public static void main(String[] args) {
//         String str ="HelloWorld";
//         System.out.println(substring(str,0,5)); //starting index and ending index manually defined
//         System.out.println(str.substring(0,5)); //Java inbuilt function
        
//     }
    
// }

 










//// Java Program to find the largest string in an array
// import java.util.*;
// public class Strings{
  
//     public static void main(String[] args) {
//         String fruits [] = {"apple","banana","mango"};
//     String Largest = fruits[0];
//     for(int i=1;i<fruits.length;i++){
//         if(Largest.compareTo(fruits[i])<0){
//             Largest = fruits[i]; //Largest will store the largest element in the array
//         }
        
//     }
//     System.out.println(Largest);
//     }
// }







// //Making of a StringBuilder
// import java.util.*;
// public class Strings{
//     public static void main (String[] args){
//         StringBuilder sb = new StringBuilder("");
//         for(char ch='a';ch<='z';ch++){
//             sb.append(ch); //Appends the character(joins the character with the string)
//         }
//         System.out.println(sb);
//     }
// }

        








//Java Program to convert a string to uppercase
// import java.util.*;
// public class Strings{
//     public static String toUppercase(String str) {
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i =0;i<str.length();i++){
//             if(str.charAt(i)==' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 ch = Character.toUpperCase(str.charAt(i));
//                 sb.append(ch);
//             }
//             else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();

//     }

//     public static void main(String[] args) {
//         String str = " hi , i am pratik";
//         System.out.println(toUppercase(str));

        
//     }
// }







//
import java.util.*;
public class Strings{
    public static String stringCompression( String str) {
        StringBuilder sb = new StringBuilder(""); 
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
                


        
    }

    public static void main(String[] args) {
        String str = "aaabbbccc";
        System.out.println(stringCompression(str));
        
    }

}
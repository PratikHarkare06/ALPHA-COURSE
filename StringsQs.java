
//Practice Question Strings:Session13
//Practice Question 1: Count the number of lowercase vowels in a string

// import java.util.*;
// public class StringsQs{
//     public static void  countLowercaseVowels(String str) {
//         int count =0;
//         for(int i=0;i<str.length();i++){
            
//             char ch = str.charAt(i);
//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 count ++;
//             }      

//         }
//              System.out.println("count of vovels is :"+count);
//         }
            
            

        
    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         countLowercaseVowels(str);
       
        
//     }
    
// }







// Practice Question 2: What will be the output of following code?
// import java.util.*;
// public class StringsQs{
//     public static void main(String[] args) {
//         String str = "ShradhaDidi";
//         String str1="ApnaCollege";
//         String str2="ShradhaDidi";
//         System.out.println(str.equals(str1) +" "+str.equals(str2));//.equals is used to compare two strings content wise and it returns boolean value
//     }
// }









// //Practice Question 3: What will be the output of following code?
// import java.util.*;
// public class StringsQs{
//     public static void main(String[] args) {
//         String str ="ApnaCollege".replace("l"," ");
//         System.out.println(str);
//     }
// }









// //Practice Question 4:Write an java program to find if a string is anagram or not
// import java.util.*;
// public class StringsQs {
//     public static void main(String args[]) {
//             String str1 = "race";
//             String str2 = "rare";  

//             str1 = str1.toLowerCase();
//             str2 = str2.toLowerCase();
//             if(str1.length() ==str2.length()){
//                 char[] arr1 = str1.toCharArray();
//                 char[] arr2 = str2.toCharArray();
//                 Arrays.sort(arr1);
//                 Arrays.sort(arr2);
//                 boolean result = Arrays.equals(arr1, arr2);
//                 if(result){
//                     System.out.println("Anagram");
//                 }
//                 else{
//                     System.out.println("Not Anagram");
//                 }
           
//             }

//         }      
        
//     }











//
import java.util.*;

public class StringsQs{
    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "rare";

        // convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] freq = new int[26];

        // Count frequency from str1
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }

        // Decrease frequency using str2
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }

        // Check if all zero
        for (int count : freq) {
            if (count != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}

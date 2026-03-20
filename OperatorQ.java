//Practice Question for Operators
// Q1 What will be the output of the following code snippets?
// import java.util.*;
// public class OperatorQ {
//     public static void main(String[] args) {
//         int x = 2;
//         int y = 5;

        
//         int exp1 = (x * y / x); 
//         int exp2 = (x * (y / x));
//         System.out.println(exp1 + ", " );
//         System.out.println(exp2);
//     }
    
// }
//Output will be 5,  4



//Q2 What will be the output of the following code snippets?
// import java.util.*;
// public class OperatorQ {
//     public static void main(String[] args) {
//         int x =200, y = 50,z= 100;

//         if(x>y && y>z){
//             System.out.println("Hello ");
//         }
//         if(z > y && z < x){
//             System.out.println("Java");
//         }
//         if((y+200)< x && (y+150) < z){
//             System.out.println("Hello Java");
//         }
//         }
//     }
//Output will be Java
//     //1️⃣ if (x > y && y > z)

// x > y → 200 > 50 → ✅ true

// y > z → 50 > 100 → ❌ false
// → Since one is false → no output

// 2️⃣ if (z > y && z < x)

// z > y → 100 > 50 → ✅ true

// z < x → 100 < 200 → ✅ true
// → Both true → ✅ prints “Java”

// 3️⃣ if ((y + 200) < x && (y + 150) < z)

// (y + 200) < x → 250 < 200 → ❌ false

// (y + 150) < z → 200 < 100 → ❌ false
// → Both false → no output



    //Q3 What will be the output of the following code snippets?
// import java.util.*;
// public class OperatorQ {
//     public static void main(String[] args) {
//         int x, y, z;
//         x = y = z = 2;
//          x += y;
//          y -= z;
//          z /= (x + y);
//             System.out.println(x + ", " + y + ", " + z);
//     }
// }
//Output will be 4, 0, 0
//Because x=2, y=2, z=2 
//x += y => x = x + y => x = 2 + 2 => x = 4
//y -= z => y = y - z => y = 2 - 2 => y = 0
//z /= (x + y) => z = z / (x + y) => z = 2 / (4 + 0) => z = 2 / 4 => z = 0



//Q4 What will be the output of the following code snippets?
// import java.util.*;
// public class OperatorQ {
//     public static void main(String[] args) {
//          int x = 9, y = 12;
//         int a = 2, b = 4, c = 6;

//         int exp = 4/3 * (x + 34) 
//                 + 9 * (a + b * c) 
//                 + (3 + y * (2 + a)) / (a + b * y);

//         System.out.println(exp);
//     }
// }
// The output will be 278
// Step 1: Break down each part
// (i) 4 / 3

// Since both are integers → integer division, so
// 4 / 3 = 1 (fractional part is discarded)

// (ii) (x + 34)

// x + 34 = 9 + 34 = 43

// So → 4/3 * (x + 34) → 1 * 43 = 43

// (iii) 9 * (a + b * c)

// b * c = 4 * 6 = 24
// a + b * c = 2 + 24 = 26
// So → 9 * 26 = 234

// (iv) (3 + y * (2 + a)) / (a + b * y)

// First, inside parentheses:

// (2 + a) = 2 + 2 = 4

// y * (2 + a) = 12 * 4 = 48

// 3 + 48 = 51
// Now denominator:

// a + b * y = 2 + 4 * 12 = 2 + 48 = 50

// So → (3 + y * (2 + a)) / (a + b * y) = 51 / 50 = 1 (integer division)

//exp = 43 + 234 + 1 = 278


//Q5 What will be the output of the following code snippets?
import java.util.*;
public class OperatorQ {
    public static void main(String[] args) {
        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}

//Output will be 20, 20
// exp1 = (y * (x / y + x / y)) = (5 * (10 / 5 + 10 / 5)) = (5 * (1 + 1)) = (5 * 2) = 10
// exp2 = (y * x / y + y * x / y) = (5 * 10 / 5 + 5 * 10 / 5) = (5 * 1 + 5 * 1) = (5 * 2) = 10



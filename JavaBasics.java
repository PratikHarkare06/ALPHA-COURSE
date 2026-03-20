import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        // Output in Java
        System.out.println("Shree Ganeshay Namah");
        //Pattern Printing

    //     System.out.println("* * * * *");
    //     System.out.println("* * * *");
    //     System.out.println("* * *");
    //     System.out.println("* *");
    //     System.out.println("*");

    // Variables in Java
        // int a = 10;
        // int b = 5;
        // String name = "Virat Kohli";

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(name);

        // a=50; // Re-assigning value to variable a
        // a=b; // Assigning value of b to a
        // System.out.println(a);


        // Data Types in Java
        // byte b = 10;
        // System.out.println(b);
        // char ch = 'A';
        // System.out.println(ch);
        // boolean var = true;
        // System.out.println(var);
        // float price = 10.5f;
        // System.out.println(price);
        // double longDecimal = 123.456789;
        // System.out.println(longDecimal);
        // long longNumber = 123456789L;
        // System.out.println(longNumber);
        // short shortNumber = 12345;
        // System.out.println(shortNumber);



        // Sum of a and b
        // int a = 10;
        // int b = 5;
        // int sum = a + b;

        // System.out.println(sum);



        // Taking Input in Java

        // Scanner sc = new Scanner(System.in);
    //     String input = sc.next(); //Single word input
    //     System.out.println(input);

    // String name = sc.nextLine(); // Full line input
    //     System.out.println(name);

        // int number = sc.nextInt(); // Integer input
        // System.out.println(number);

        // float price = sc.nextFloat(); // Float input
        // System.out.println(price);

        // double decimal = sc.nextDouble(); // Double input
        // System.out.println(decimal);

        // boolean var = sc.nextBoolean(); // Boolean input
        // System.out.println(var);

        // short shortNumber = sc.nextShort(); // Short input

        // System.out.println(shortNumber);

        // byte byteNumber = sc.nextByte(); // Byte input
        // System.out.println(byteNumber);

        // long longNumber = sc.nextLong(); // Long input
        // System.out.println(longNumber);



        // Sum of two numbers taken as input

        //  Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("The sum of a and b is: " + sum);



      // Product of two numbers taken as input
        // Scanner sc = new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int product = a*b;
        // System.out.println("The product of a and b is: " + product);


        //Area of a circle
        // Scanner sc = new Scanner(System.in);
        // float radius = sc.nextInt();
        // float area = 3.14f * radius * radius;
        // System.out.println("The area of a circle is : " + area);


        //Type Conversion in Java

        // int a = 10;
        // float b = a; // Implicit conversion (widening)
        // System.out.println(b);


        // Type Casting in Java
        // float a = 10.5f;
        // int b =  (int) (a); // Explicit conversion (narrowing)
        // System.out.println(b);


        // float marks =99.99f;
        // int Marks2 = (int)(marks);
        // System.out.println(Marks2); // Output: 99

        // char ch = 'A';
        // int number = (ch); // Explicit conversion (narrowing)
        // System.out.println(number); // Output: 65 (ASCII value of 'A')



        // Type Promotion in Expressions 1St condition

        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(b)); // 98
        // System.out.println((int)(a)); // 97
        // System.out.println(b-a); // 1

        // short a = 5;
        // byte b = 10;
        // char c = 'c';
        // byte bt = (byte)(a + b + c); // Type promotion to int, then cast back to byte
        // System.out.println(bt); // Output may vary based on 

        // Type Promotion in Expressions 2nd condition
        // int a = 5;
        // float b = 10.5f;
        // long c= 20L;
        // double d= 30.5;
        // double result = a + b + c + d; // Type promotion to double
        // System.out.println(result); // Output: 66.0

        byte b =5;
        byte a = (byte)(b * 2); // Error: Type mismatch
        System.err.println(a);



     }
     

    // Add DSA methods here (e.g., binarySearch, sort, etc.)
}

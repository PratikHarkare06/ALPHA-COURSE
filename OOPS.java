// OOPS: Object Oriented Programming System in Java
// Class and Object
// import java.util.*;
// public class OOPS {
//     public static void main(String[] args) {
//         Pen pen1 = new Pen(); //Created an object of Pen class
//         pen1.setColor("Blue");
//         pen1.setTip(5);
//         System.out.println(pen1.color);
//         System.out.println(pen1.tip);




//     // Access Modifiers
//         BankAccount myAcc = new BankAccount();
//         myAcc.username = "user123";
//         myAcc.setPassword("mypassword");

//     }
// }




//     // class Pen {
//     //     String color;
//     //     int tip;
    
//     //     public void setColor(String newColor){
//     //         color = newColor;
//     //     }
//     //     public void setTip(int newTip){
//     //         tip = newTip;


    



//         }

//     }

//     // Acess Modifiers
//     class BankAccount {
//         public String username;
//         private String password;
//         public void setPassword(String pwd){
//             password = pwd;
//         }
//     }


        



// //Getters and Setters

// import java.util.*;

// public class OOPS {
//     public static void main(String[] args) {
//         Pen pen1 = new Pen();  
//         pen1.setColor("Blue");
//         System.out.println(pen1.getColor());
//         pen1.setTip(5);
//         pen1.setColor("Red");
//         pen1.setTip(10);


//         System.out.println(pen1.getColor());

//         System.out.println(pen1.getTip());
      


//     }

//     static class Pen {
//         private String color;
//         private int tip;

//         String getColor() {
//             return this.color;
//         }

//         int getTip() {
//             return this.tip;
//         }

//         void setColor(String color) {
//             this.color = color;
//         }

//         void setTip(int tip) {
//             this.tip = tip;
//         }
//     }
// }








// //Constructors in Java
// import java.util.*;
// public class OOPS{
//     public static void main(String[] args) {
//         Student s1 = new Student();        
//     }
//     static class Student {
//             String name;
//             int rollNo;
//             // Constructor
//             Student() {
//                 System.out.println("Constructor called");
               
               
//             }
            
// }
// }





// //Types of Constructors in Java
// import java.util.*;

// public class OOPS {
//     public static void main(String[] args) {
//         Student s1 = new Student();          // calls default constructor
//         Student s2 = new Student("Alice");   // calls name constructor
//         Student s3 = new Student(101);       // calls rollNo constructor
//     }
// }

// class Student {
//     String name;
//     int rollNo;

//     // Non-Parameterized Constructor
//     Student() {
//         System.out.println("Default Constructor called");
//     }

//     // Parameterized Constructor #1
//     Student(String name) {
//         this.name = name;
//         System.out.println("Name Constructor called");
//     }

//     // Parameterized Constructor #2
//     Student(int rollNo) {
//         this.rollNo = rollNo;
//         System.out.println("RollNo Constructor called");
//     }
// }







// //Copy Constructor in Java

// import java.util.*;

// public class OOPS {
//     public static void main(String[] args) {
//         Student s1 = new Student();
        
    
//         s1.name = "Alice";
//         s1.rollNo = 101;
//         s1.password = "pass123";

//         s1.marks[0] = 95; // Changing marks for s1
//         s1.marks[1] = 85;
//         s1.marks[2] = 75;

//         Student s2 = new Student(s1); // Using copy constructor
//         s2.password = "newpass456"; // Changing password for s2

//         s1.marks[0] = 100; // Modifying marks for s1 after copying
        

//         for (int i = 0; i < 3; i++) {
//             System.out.println(s2.marks[i]);
//         }

      
// }

//     static class Student {
//     String name;
//     int rollNo;
//     String password;
//     int marks[];

//     // //Copy Constructor(Shallow Copy)
//     // Student(Student s1) {
//     //     marks = new int[3];
//     //     this.name = s1.name;
//     //     this.rollNo = s1.rollNo;
//     //     this.marks = s1.marks; // Shallow Copy
//     // }

//     //Copy Constructor(Deep Copy)
//     Student(Student s1) {
//         marks = new int[3];
//         this.name = s1.name;
//         this.rollNo = s1.rollNo;
//         for (int i = 0; i < marks.length; i++) {
//             this.marks[i] = s1.marks[i]; // Deep Copy
//         }
//     }

//     Student() {
//         marks = new int[3];
//         System.out.println("Constructor called");
//     }
//     Student(String name) {
//         marks = new int[3];
//         this.name = name;
//     }
//     Student(int rollNo) {
//         marks = new int[3];
//         this.rollNo = rollNo;

       

// }

// }
// }









////Inheritance in Java
// import java.util.*;
// public class OOPS{
//     public static void main(String[] args) {
//     Dog dog1 = new Dog();
//     dog1.eat();
//     dog1.bark();
//     dog1.breathe();


//     }
//         // Base class object
//         static class Animal {
//             void eat() {
//                 String color = "Brown";
//                 System.out.println("Eating...");
//             }
//             void breathe() {
//                 System.out.println("Breathing...");
//             }
//         }
//         // Derived class object
//         static class Dog extends Animal {
//             void bark() {

//                 System.out.println("Barking...");
//             }


//         }
        
//     }









// //Multiple Levels of Inheritance in Java
// import java.util.*;
// public class OOPS {

//     public static void main(String[] args) {
//         Dog Corso = new Dog();
//         Corso.eat();
//         Corso.legs = 4;
//         System.out.println(Corso.legs);
//     }

//     // Base class
//     static class Animal {
//         void eat() {
//             System.out.println("Eating...");
//         }
//         void breathe() {
//             System.out.println("Breathing...");
//         }
//     }

//     static class Mammal extends Animal {
//         int legs;
//     }

//     static class Dog extends Mammal {
//         String breed;
//     }
// }







// //Hierarchical Inheritance in Java
// import java.util.*;
// public class OOPS {
//     public static void main(String[] args) {
//         Mammale dog1 = new Mammale();
//         dog1.eat();
//         dog1.walk();
//     }
// }
    

//     class Animal {
//         void eat() {
//             System.out.println("Eating...");
//         }
//         void breathe() {
//             System.out.println("Breathing...");
//         }
//         }
//     class  Mammale extends Animal {
//         void walk() {
//             System.out.println("Walking...");
//         }
//         class Fish extends Animal {
//             void swim() {
//                 System.out.println("Swimming...");
//             }
//             }
//             class Bird extends Animal {
//                 void fly() {
//                     System.out.println("Flying...");
//                 }
//             }
//         }
    


        
        
    
   ////Polymorphism in Java 
   /// //Method Overloading
//    import java.util.*;
//    public class OOPS {
//     public static void main(String[] args) {
//         calculator calc = new calculator();
//         System.out.println(calc.sum(5, 10));
//         System.out.println(calc.sum(5.5f, 10.5f));
//         System.out.println(calc.sum(5, 10, 15));

        
//     }
//    }
//    class calculator {
//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }
//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }





// // //Method Overriding in Java
// import java.util.*;
// public class OOPS{
//     public static void main(String[] args) {
//         Dear deer1 = new Dear();
//         deer1.eat();
        
//     }
// }


//   class Animal{
//     void eat(){
//         System.out.println("Eat Anything");
// }
//   }
// class Dear extends Animal{
//     void eat(){
//         System.out.println("Eat Grass");
//     }
// }






// //// //Abstraction in Java
// /// //Abstract Class
// import java.util.*;
// public class OOPS {
//     public static void main(String[] args) {
//         Horse h1= new Horse();
//         h1.eat();
//         h1.walk();

//         Mustang m1 = new Mustang();
//         //ANimal -> Horse -> Mustang


//         // Chicken c1 = new Chicken();
//         // c1.eat();
//         // c1.walk();

//         System.out.println(h1.color);

//         // Animal a =new Animal() ;  // We cannot create object of abstract class
            
        
    
        
//     }
// }
//  abstract class Animal {
//     String color;
//     Animal() { // Constructor of abstract class
//         System.out.println("Animal Constructor Called");
//         color = "Brown";
//     }
        
//     void eat() {
//         System.out.println(" Animal Eating...");
//     }
// // Abstract method 
//     abstract void walk() ;

//         }
//     // Abstract implementation classes
//         class Horse extends Animal {
//             Horse() {
                
//                 System.out.println("Horse Constructor Called");
//             }
//             void changeColor() {
//                 color = "Black";
//             }
//             void walk() {
//                 System.out.println("Horse Walks on 4 Legs.");
//             }
//         }
//             class Chicken extends Animal {
//                 void changeColor() {
//                     color = "White";
//                 }
//                 void walk() {
//                     System.out.println("Chicken Walks on 2 Legs.");
//                 }

            
//         }
//         class Mustang extends Horse {
//             Mustang() {
//                 System.out.println("Mustang Constructor Called");
//             }
//         }
            


//




// ////Interfaces in Java
// import java.util.*;
// public class OOPS{
//     public static void main(String[] args) {
//         Queen q1 = new Queen();
//         q1.moves();

//         Rook r1 = new Rook();
//         r1.moves();

//         King k1 = new King();
//         k1.moves();
        
//     }
// }
// interface chessPlayer {
//     void moves();
// }
// class Queen implements chessPlayer {
//     public void moves() { //we need to public here because interface methods are public by default
//         System.out.println("Up, Down, Left, Right, Diagonal(all directions)");
//     }
// }
// class Rook implements chessPlayer {
//     public void moves() {
//         System.out.println("Rook can move Up, Down, Left, Right");
//     }
// }
// class King implements chessPlayer {
//     public void moves() {
//         System.out.println("King can move one step in any direction");
//     }
// }







// ////Multiplr Inheritance using Interfaces in Java
// import java.util.*;
// public class OOPS{
//     public static void main(String[] args) {
//         Bear b1 = new Bear();
//         b1.eatPlants();
//         b1.eatMeat();
        
//     }
// }
// interface Herbivore{
//     void eatPlants();
// }
// interface Carnivore{
//     void eatMeat();
// }
// class Bear implements Herbivore, Carnivore{
//     public void eatPlants(){
//         System.out.println("Eating Plants");
//     }
//     public void eatMeat(){
//         System.out.println("Eating Meat");
//     }
// }



// 









////Super Keyword in Java
import java.util.*;
public class OOPS{
    public static void main(String[] args) {
        Horse h1 = new Horse();
        
        
    }
}
class Animal {
    Animal() {
        System.out.println("Animal Constructor Called");
    }
}
class Horse extends Animal {
    Horse() {
        super(); // Calls the constructor of the parent class (Animal)
        System.out.println("Horse Constructor Called");
    }
}
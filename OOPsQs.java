// import java.util.*;
// public class OPPsQs {
//     public static void main(String[] args) {
//         //Printthesum,difference and product of two complex numbers by creating a class named' Complex' with separate methods for each operation whose real and inimaginary parts are entered by the user
        
//     }
    
// }






// Practice Qs 2:What will be the output of following code??
import java.util.*;
public class OOPsQs {
    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());
    }
    
}
class Automobile{
    private String drive(){
        return"Driving Vehicle";

    }
}
class Car extends Automobile{
    public String drive(){
        return"Driving Car";
    }
}

class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving Electric Car";
    }
    
}



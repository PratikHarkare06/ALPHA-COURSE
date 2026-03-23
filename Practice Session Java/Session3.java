
import java.util.*;
public class Session3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter the month :");
        int month = sc.nextInt();
      

        
        if (month  == 2){
            System.out.println("February has 28 days");
        }
        else if(month < 8){
            if(month % 2 == 0){
                System.out.println("The month has 30 days");
            }
            else{
                if(month % 2 != 0){
                    System.out.println("The month has 31 days");
                }
            }
            }
            else{
                if(month % 2 == 0){
                    System.out.println("The month has 31 days");
                }
                else{
                    System.out.println("The month has 30 days");
                }
            }

        
        }
                
    }
    


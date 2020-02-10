/** 
 * 
 * @author      Jermine
 * Created:     2.5.20
 * Description: This program calculates the product of 3 numbers.
 * 
 **/
import java.util.Scanner ;
public class classwork {
   public static void main(String[] args) {
      
    Scanner  keyboard = new Scanner(System.in) ;

    int number1, number2, number3, answer ;
      
        System.out.println("The product of") ;
   
        System.out.print("First number: ") ;
            number1 = keyboard.nextInt() ; 
    
        System.out.print("Second number: ") ;
            number2 = keyboard.nextInt() ;
   
        System.out.print("Third number: ") ;
            number3 = keyboard.nextInt() ;
         
            answer = number1 * number2 * number3 ;

        System.out.println("Answer = " + answer) ; 


   }
        
    }


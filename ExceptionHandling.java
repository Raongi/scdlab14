import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling{
    public static void main(String[] args){
      Scanner s= new Scanner(System.in);
    try{
        System.out.println("Enter first number: ");
    int a=s.nextInt();
    System.out.println("Enter second number: ");
    int b=s.nextInt();
    int result=a/b;
    System.out.println("Result: " + result);
     }
     catch(ArithmeticException e){
        System.out.println("Error: Division by zero is not allowed..");
     }
     catch(InputMismatchException e){
        System.out.println("Error: Please enter valid integers only..");
     }
     finally{
        System.out.println("Program excetued successfully:)");
     }
    }

}//commiting

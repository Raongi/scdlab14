import java.util.Scanner; //pull pulling 
public class ExceptionDemo{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a=s.nextInt();
    System.out.println("Enter second number: ");
    int b=s.nextInt();
    int result=a/b;
    System.out.println("Result: " + result);
  }
}

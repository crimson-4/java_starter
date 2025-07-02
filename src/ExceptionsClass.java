import  java.util.Scanner;
public class ExceptionsClass {
static    Scanner scanner= new Scanner(System.in);
    public static void main(String[] args)
    {
        try {
            System.out.println("Enter first number");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the second number");
            int b = Integer.parseInt(scanner.nextLine());
            int result = a / b;
            System.out.println("result" + result);
        }
        catch(Exception e)
        {
            System.out.println("error"+e);
        }
        
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Car nc=new Car();
        nc.drive();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Name");
        String name= sc.nextLine();
        System.out.println("moshi moshi"+name);
        Dog dg= new Dog();
        dg.makeSound();
    }
}





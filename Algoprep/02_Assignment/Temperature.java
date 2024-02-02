import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       float Celsius = input.nextFloat();
       
       float Fahrenheit =  ((Celsius*9)/5)+32;
       System.out.println(Fahrenheit);
    }
}
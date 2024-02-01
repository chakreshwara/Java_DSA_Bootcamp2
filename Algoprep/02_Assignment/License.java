import java.util.Scanner;

public class License {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if(age>=18){
            System.out.println("you can get license");
        }else{
            System.out.println("you canot get license");
        }
        
    }
    
}

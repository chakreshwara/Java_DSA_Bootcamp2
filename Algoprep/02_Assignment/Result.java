import java.util.Scanner;

public class Result {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        if(marks>=35){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        }
    }


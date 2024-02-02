import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Salary = input.nextInt();

        int Bonus = 0;
        if (Salary>25000) {
            Bonus=2000;
        }else{
            Bonus=1000;
        }
        
        int Labourwage = Salary + Bonus;
        System.out.println(Labourwage);
    }
}


    

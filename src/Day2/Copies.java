package Day2;

import java.util.Scanner;

public class Copies {
    public static void main(String[] Args) {
        //Declare Variables
        int copiesNumber = 0; //input
        int i = 0;
        Double totalCost = 0.0;
        Double totalCostCopies = 0.0;

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of copies\n");
        copiesNumber = sc.nextInt();


        if (copiesNumber>=0 && copiesNumber <= 100) {
            totalCost = copiesNumber * 0.05;
            System.out.printf("Total Cost is R%.2f" , totalCost);
        }
            else if(copiesNumber > 100){
                totalCost = (100 * 0.05) + (copiesNumber - 100) * 0.03;
                System.out.printf("Total Cost is R%.2f" , totalCost);
            }
            else{
            System.out.println("invalid");
        }


    }
}

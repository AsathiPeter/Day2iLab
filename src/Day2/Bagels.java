package Day2;

import java.util.Scanner;

public class Bagels {
    public static void main(String[] Args) {
        //Declare variables
        int bagelsNumber = 0; //input
        Double totalCost = 0.0; //output
        Double totCost = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bagels\n");
        bagelsNumber = sc.nextInt();

        if (bagelsNumber >= 1 && bagelsNumber <= 5) {

            totalCost = bagelsNumber * 0.75;

            System.out.println("Total Cost is R" + totalCost);
        }

        else if(bagelsNumber >= 6) {

            totalCost = bagelsNumber * 0.60;
            System.out.println("Total Cost is R" + totalCost);
        }


    }
}


package Day2;

import java.util.Scanner;

public class GrossPay {
    public static void main(String[] Args) {
        //Declare Variables
        Double hoursWorked = 0.0; //input
        Double ratePayed = 0.0; //input
        Double salary = 0.0; //output

            Scanner sc = new Scanner(System.in);

            System.out.print("Please enter hour worked\n");

            hoursWorked = sc.nextDouble();
            System.out.print("Please enter rate payed\n");

            ratePayed = sc.nextDouble();

            if (hoursWorked >= 1 && hoursWorked <= 40) {
                salary = hoursWorked * ratePayed;
                System.out.printf("Salary is R%.2f", salary);
            }

            if (hoursWorked > 40) {
                salary = (40 * ratePayed) + ((hoursWorked - 40) * 1.5 * ratePayed);
                System.out.printf("Salary is R%.2f", salary);
            }
        }
    }

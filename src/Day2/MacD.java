package Day2;

import java.util.Scanner;

public class MacD {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Who was the first Ronald McDonald?\n");

       String name = sc.nextLine();

        if (name.equals("Willard Scott")) {

            System.out.print("Correct");
        }
        else {
            System.out.print("Nice Try!");
        }
    }
}

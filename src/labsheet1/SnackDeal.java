package labsheet1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SnackDeal {
    public static void main(String[] args) {
        //try
        try {

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Declaration
        String Name;
        String Course;
        int snacks;

        //Allocation
        System.out.print("Please enter your name:");
        Name = sc.nextLine();
        System.out.print("Enter your course:");
        Course = sc.nextLine();
        System.out.println("How many snack would you like?");
        snacks = sc.nextInt();

        //Output
            if (snacks < 0) {
                System.out.println("Enter right number");
            } else if (snacks == 0) {
                System.out.println("\nName: " + Name + "\nCourse: " + Course + "\nSnacks: " + snacks);
            } else {
                System.out.println("\nName: " + Name + "\nCourse: " + Course + "\nSnacks: " + snacks + "\nCost: " + snacks * 2);
            }
        }

        //Output
        catch (InputMismatchException ex) {
            System.out.println("We have given input as float expecting integer "+ ex);
    }
        System.exit(0);
    }
}

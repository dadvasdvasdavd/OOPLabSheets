package labsheet1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CyclistSponsor {
    public static void main(String[] args) {
        //Try - Exeption
        try {

        //Declaration
        String name;
        double km;
        double pom = 0;

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Alocation
        System.out.print("Please enter your name:");
        name = sc.nextLine();
        System.out.print("Please enter the number of km you cycled:");
        km = sc.nextInt();

        //if decision-making
        if(km < 0){
            System.out.println("Please enter right number.");
            System.exit(0);
        }

        //Body
            if(km>10){
                km -=10;
                pom = 17.5+ km*2.5;
            }
            else{
                pom = km*1.75;
            }

        //Output
            if(km == 0){
                System.out.println("\nName: "+name+"\nDistance cycled: "+km);
            }
            else{
                System.out.println("\nName: "+name+"\nDistance cycled: "+km+"\nSponsorship amount due: "+pom+"€");
            }

        //Catch
        } catch (InputMismatchException ex) {
            System.out.println("We have given input as float expecting integer:"+ ex);
        }
        System.exit(0);
    }
}

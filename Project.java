import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        //Mini Project

        Scanner sc = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.print("Guess the number(1-100): ");
            userNumber = sc.nextInt();

            if(userNumber == randomNumber) {
                System.out.println("Woo-Hoo! Correct Number!!! \n");
                break;
            }
            else if(userNumber > randomNumber) {
                System.out.println("Your number is too large \n");
            }
            else {
                System.out.println("Your number is too small \n");
            }
        }while(userNumber >= 0);

        System.out.print("The number was: ");
        System.out.println(randomNumber);
    }
}

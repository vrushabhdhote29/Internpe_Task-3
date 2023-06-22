package Internpe.Task3;

import java.util.Random;
import java.util.Scanner;
class Game{
    int random;
    int userInput;
    int noOffGuess=0;
    public Game(){
        Random ran = new Random();
        random = ran.nextInt(100);
    }
    public void noOfGuess(){
        noOffGuess++;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number from 0 to 100: ");
        userInput = sc.nextInt();
    }
    public boolean isCorrectGuess() {
        if (userInput == random) {
            System.out.println("Awesome! You Guessed Right Number: "+random);
            System.out.format("You took %d number of Guesses\n",noOffGuess);

            return true;
        }
        else if (userInput < random){
            System.out.println("Its too Low, Try Again!");
        }
        else if ((userInput > random) && userInput<=100){
            System.out.println("Its too High, Try Again!");
        }
        else {
                System.out.println("You Entered Above 100 no. Please reenter right no.");
            }
        return false;
    }
}
public class Guess_the_Number_Game {
    public static void main(String[] args) {
        String play = "yes";
        Scanner sc = new Scanner(System.in);
        while (play.equals("yes")) {
            Game g = new Game();
            boolean b = false;
            while (!b) {
                g.noOfGuess();
                b = g.isCorrectGuess();
            }
            System.out.print("You want to play again! type \"yes\" or \"no\": ");
            play = sc.next();
        }
        sc.close();
    }
}


import java.util.Random;
import java.util.Scanner;

class Main{
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int minRange = 1;
        int maxRange = 100;
        int score = 0;
        int attemptLimit = 5;
        boolean playAgain = true;

        while(playAgain){
            int numgenerated = r.nextInt(maxRange-minRange+2);
            System.out.println("NUMBER GUESSING GAME");
            System.out.println("you should choose between the range of "+minRange+" and "+maxRange);

            int attempt = 0;
            boolean guessednumber = true;

            while(attempt<attemptLimit && guessednumber) {
                System.out.println("Now the available limit is :"+(attemptLimit - attempt));
                int userguess = s.nextInt();

                if (userguess == numgenerated) {
                    System.out.println("Congratulation you won!!");
                    score = score + attemptLimit - attempt;
                } else if (userguess < numgenerated) {
                    System.out.println("The number is lesser, try again");

                } else {
                    System.out.println("The number is greater, try again");
                }
                attempt++;

                if (!guessednumber) {
                    System.out.println("Sorry you ran out of the limits...");
                }
            }
            System.out.println("Your current score is :" + score);
            System.out.println("The correct answer is :"+numgenerated);
            System.out.println("Do you want to play again ?(yes/no): ");
            String playerresponse = s.next();
            playAgain = playerresponse.equalsIgnoreCase("yes");
        }
        System.out.println("YOUR FINAL SCORE IS :"+score);
        s.close();
    }
}

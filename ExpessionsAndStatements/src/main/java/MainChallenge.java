public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5555;
        int levelCompleted = 5;
        int bonus = 100;


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted + bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Challenge
        /* Set the existing score variable to 10,000
        Set the existing levelCompleted variable to 8
        Set the existing bonus variable to 200
        Use the same if condition (meaning if gameOver is true) you want to perform
            the same calculation, and print out the value of the finalScore variable
         */
    }
}
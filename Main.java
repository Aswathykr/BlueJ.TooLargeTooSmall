import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        System.out.println("Welcome to Number guessing Game");
        System.out.println("Enter '-1' to exit");
        Scanner scanner = new Scanner(System.in);
        int winNumber = new Random().nextInt(21);
        int nTries = 0;
        while(true)
        {
            nTries++;
            System.out.println("Enter a number between 1 and 20");
            try{
                int guess = scanner.nextInt();
                if(guess == -1)
                {
                    System.out.println("You Quit!! Try harder next time!!");
                    break;
                }
                else if(guess < 1 || guess > 20)
                {
                    System.out.println("Error: You entered a number "+
                                            "outside the range;");
                }
                else if(guess < winNumber)
                {
                    System.out.println("Too small");
                }
                else if(guess > winNumber)
                {
                    System.out.println("Too high");
                }
                else
                {
                    System.out.printf("You guessed rt!! " +
                                            "you won in %d tries", nTries);
                    break;
                }
            }catch(Exception e){
                System.out.println("Enter a valid integer");
                scanner = new Scanner(System.in);
            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}

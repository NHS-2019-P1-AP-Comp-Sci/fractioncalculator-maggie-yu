/**
 * @author Mr. Rasmussen
 */

package fracCalc;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args)
    {
       Scanner userInput = new Scanner (System.in);




      System.out.print("What is your equation? : ");

       String stringInput = userInput.nextLine();




       System.out.println(produceAnswer(stringInput));                       




       userInput.close();

    }

    //      e.g. return ==> "1_1/4"

    public static String produceAnswer(String input)

    {
    	System.out.println("Length of string = " + input.length());

    	int postwo = input.indexOf(" ") + 3;
    	System.out.println("Position of second fraction = " + postwo);
    	System.out.println("");







        // TODO: Implement this function to produce the solution to the input




        return "";

        return input.substring(postwo);//returns what you want to output into the console

    }




    // TODO: Fill in the space below with any helper methods that you think you will need

}

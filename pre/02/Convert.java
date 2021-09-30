import java.util.Scanner;

/**
Converts a temperature from Celsius to Fahrenheit. It should
(1) prompt the user for input, (2) read a double value from the
keyboard, (3) calculate the result, and (4) format the output to
 one decimal place.
*/

public class Convert {
  public static void main(String[] args) {
    double celsius;
    Scanner in = new Scanner(System.in);

    System.out.print("How many degrees Celsius? ");
    celsius = in.nextDouble();

    double fahrenheit = ((celsius * 9) / 5) + 32;
    System.out.printf("%.2f degrees celsius = %.2f degrees farenheit\n",
    celsius, farenheit);
  }
}

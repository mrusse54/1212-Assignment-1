/**
 * Description :This program has menu that gives the user the ability to pick one of five options listed by entering a value from 1 to 5. 
 * first a Lab Test Average Calculator, second Dice Roll, third Cylinder Volume Calculator, fourth Compute Distance between two points designated
 *  by (x1, y1) and (x2, y2), and fifth to Quit.
 * 
 * @author Mitchell Russell
 *
 * @version 1.0.2
 *
 * @Date: 2/9/20
 * 
 * Pseudocode : 
 * 
 * Display welcome message and five options
 * user inputs value that matches option on menu
 * if statement for option picked
 * 
 * if 1 input is entered, option 1. is executed
 * Display option picked and prompt user to enter three values for the test grades
 * add the three inputs entered
 * divide result of added inputs by three to get average
 * display average and the three test grades entered
 * display goodbye message
 * 
 * if 2 is entered option 2. is executed
 * Display option picked
 * Prompt user to guess the dice roll by entering 1 for odd or 2 for even 
 * generate two random values within the range of [1,6]
 * Add the two random values 
 * use remainder on the value with the divisors of 2 being even and 3 being odd
 * if value % 2 = 0 then the value is even or if value % 3 = 0 then the value is odd
 * if value % 2 = 1 then the value is odd or if value % 3 = 0 then the value is even
 * if statement to check if the remainder matches guess of odd or even
 * Display victory message if remainder is 0 and guess matches divisor resulting in 0
 * Display lose message if remainder is 1 and guess matches divisor resulting in 1
 * Display goodbye message
 * 
 * if 3 is entered option 3. is executed
 * Display option picked 
 * Prompt user to enter positive radius and height
 * Calculate the area by using entered radius, Math.pow(a,b) and, formula 3.14*radius^2
 * Calculate the cylinder volume by area * height
 * Display the height, radius, and cylinder volume
 * 
 * if 4 entered option 4. is executed
 * Display option picked and formula
 * Display prompt for user to enter x1,x2,y1,y2 in that order
 * Use formula ( x2 + ( -1.0 * x1) )
 * Use formula ( y2 + ( -1.0 * y1) )
 * Square resulting value of adding the xs by using Math.pow(a,b)
 * Square resulting value of adding the ys by using Math.pow(a,b)
 * Add the result of squaring the xs and ys together
 * Square root the result of adding by using Math.pow(a,b) to get distance between two points
 * Display the distance between two points and points entered
 * Display goodbye message
 * 
 * If 5 is entered option 5. is executed
 *  Display quite message
 *  Display goodbye message
 */

// import Scanner class
import java.util.Scanner;

// class decoration 
public class Assingment_1 {

	// main method
	public static void main(String[] args) {

		// creates Scanner object that receives input from keyboard named input
		Scanner input = new Scanner(System.in);

		// prints prompts the user to enter a value
		System.out.println(" Enter 1 for Lab Test Average Calculator. ");
		System.out.println(" Enter 2 for Dice Roll guess. ");
		System.out.println(" Enter 3 for Cylinder Volume Calculator. ");
		System.out.println(" Enter 4 to Compute Distance between two points designated by (x1, y1) and (x2, y2). ");
		System.out.println(" Enter 5 to Quit. ");

		// creates int variable and stores value inputed from users keyboard
		int menuOption = input.nextInt();

		// if value from keyboard assigned to menuOption variable is 1 if statement for
		// option 1 is executed
		if (menuOption == 1) { // if statement for menuOption variable when value is equal to 1
			// prints a line with option picked
			System.out.println(" You have picked Lab Test Average Calculator.  ");

			// prompts user to input three values
			System.out.println(" Enter three test grades. ");

			// creates labTest1 a double variable and takes users input from keyboard and
			// stores value in the variable
			double labTest1 = input.nextDouble();

			// creates labTest2 a double variable and takes users input from keyboard and
			// stores value in the variable
			double labTest2 = input.nextDouble();

			// creates labTest3 a double variable and takes users input from keyboard and
			// stores value in the variable
			double labTest3 = input.nextDouble();

			// creates double variable labTestAverage with the expression ( labTest1 +
			// labTest2 + labTest3) / 3 to calculate the average of the three test
			double labTestAverage = (labTest1 + labTest2 + labTest3) / 3;

			// prints values of labTest1, labTest2, labTest3, and labTestAverage
			System.out.println(" The average of the test grades " + labTest1 + " " + labTest2 + " " + labTest3 + " is "
					+ labTestAverage);
		}

		// if value from keyboard assigned to menuOption variable is 2, if statement for
		// option 2 is executed
		if (menuOption == 2) { // if statement for menuOption variable when value is equal to 2

			// prints a line with option picked
			System.out.println(" You have picked, dice roll.  ");

			// creates number1 an int variable that type cast the random method with a range
			// of 1 to 6 and stores the value in said variable
			int number1 = (int)(Math.random() * ((6 - 1) + 1)) + 1;

			// creates number2 an int variable that type cast the random method with a range
			// of 1 to 6 and stores the value in said variable
			int number2 = (int)(Math.random() * ((6 - 1) + 1)) + 1;

			// prints prompt for user to input value
			System.out.println(" Guess if the dice roll will be even or odd, input 2 for even or 1 for odd. ");

			// creates guess int variable and takes users input from keyboard and stores
			// value in the variable
			int guess = input.nextInt();

			// creates even an int variable with the expression (number1 + number2) % 2 to
			// see if value is even
			int even = (number1 + number2) % 2;

			// creates odd an int variable with the expression (number1 + number2) % 3 to
			// see if value is odd
			int odd = (number1 + number2) % 3;

			// if statement to see if guess == 2 && even == 0 is true or false
			if (guess == 2 && even == 0) // if even = 0 the value is even
				System.out.println(" Congrats you guessed correct! "); // prints when if statement is true and guess is
																		// right

			// if statement to see if guess == 2 && even > 0 is true or false
			else if (guess == 2 && even > 0) // if even > 0 value is odd
				System.out.println(" Sorry you guessed wrong, better luck next time. "); // prints when if statement is
																							// true and guess is wrong

			// if statement to see if guess == 1 && odd == 0 is true or false
			if (guess == 1 && odd == 0) // if odd = 0 the value is odd
				System.out.println(" Congrats you guessed correct! "); // prints when if statement is true and guess is
																		// right

			// if statement to see if guess == 1 && odd > 0 is true or false
			else if (guess == 1 && odd > 0) // if odd > 0 value is even
				System.out.println(" Sorry you guessed wrong, better luck next time. "); // prints when if statement is
																							// true and guess is wrong
		}
		// if value from keyboard assigned to menuOption variable is 3 if statement for
		// option 3 is executed
		if (menuOption == 3) { // if statement for menuOption variable when value is equal to 3

			// prints line with option picked
			System.out.println(" You have picked, cylinder volume calculator.  ");

			// creates constant double variable named pie with the value of 3.14
			final double pie = 3.14;

			// prints line that prompts user to input value
			System.out.println(" Enter radius of of circle ");

			// creates radius a double variable and takes users input from keyboard and
			// stores value in the variable
			double radius = input.nextDouble();

			// prints line that prompts user to enter value
			System.out.println(" Enter height of of circle ");

			// creates height a double variable and takes users input from keyboard and
			// stores value in the variable
			double height = input.nextDouble();

			// if statement to see if radius value is greater or equal to 0 is true or false
			if (radius >= 0 && height >= 0) {

				// creates cylinderCircleArea a double variable with the expression pie *
				// Math.pow(radius, 2)
				double cylinderCircleArea = pie * Math.pow(radius, 2);

				// creates circleVolume a double variable with the expression cylinderCircleArea
				// * height that calculate the circle volume
				double cylindereVolume = cylinderCircleArea * height;

				// print line with values of height, radius, and circleVolume
				System.out.println(" The volume of a cylinder with the of height " + height + " and a radius of "
						+ radius + " is " + cylindereVolume);
			} else { // if statement ( radius >= 0 && height >= 0 ) is false
				System.out.println(" Enter a postive radius or height value please! "); // prints line informing user of
																							// mistake
			}
		}
		// if value from keyboard assigned to menuOption variable is 4 if statement for
		// option 4 is executed
		if (menuOption == 4) { // if statement for menuOption variable when value is equal to 4

			// prints a line with option picked
			System.out.println(
					" You have picked, compute Distance between two points designated by (x1, y1) and (x2, y2). ");

			// prints line with formula being used
			System.out.println(" The formula used is sqrt[(x2-x1)^2+ (y2-y1)^2] ");

			// prints prompt for user to input value
			System.out.println(" Enter values of x2 ");

			// creates double variable called x2 that stores user input as its value
			double x2 = input.nextDouble();

			// prints prompt for user to input value
			System.out.println(" Enter values of x1 ");

			// creates double variable called x1 that stores user input as its value
			double x1 = input.nextDouble();

			// prints prompt for user to input value
			System.out.println(" Enter values of y2 ");

			// creates double variable called y2 that stores user input as its value
			double y2 = input.nextDouble();

			// prints prompt for user to input value
			System.out.println(" Enter values of y1 ");

			// creates double variable called y1 that stores user input as its value
			double y1 = input.nextDouble();

			// creates double variable called x3 with the expression x2 + ( -1.0 * x1 )
			double x3 = x2 + (-1.0 * x1);

			// creates double variable called y3 with the expression y2 + ( -1.0 * y1 )
			double y3 = y2 + (-1.0 * y1);

			// creates double variable called x4 with the expression Math.pow(x3, 2)
			double x4 = Math.pow(x3, 2);

			// creates double variable called y4 with the expression Math.pow(y3, 2)
			double y4 = Math.pow(y3, 2);

			// creates double variable called xy5 with the expression x4 + y4
			double xy5 = x4 + y4;

			// creates double variable called xy6 with the expression Math.pow(xy5, 0.5)
			double distanceBetweenPoints = Math.pow(xy5, 0.5);

			// prints line that shows the points values and the value of the distance
			// between the points (x1 , y1) ( x2 , y2) (xy6)
			System.out.println(" The distance between the two points " + "(" + x1 + " , " + y1 + ")" + "(" + x2 + " , "
					+ y2 + ")" + " is " + distanceBetweenPoints);
		}
		// if value from keyboard assigned to menuOption variable is 5 or greater if
		// statement for option 5 is executed
		else if (menuOption >= 5) { // if statement for menuOption variable when value is equal to or greater than 5
			System.out.println(" You have picked quit. "); // prints line with option picked
		}
		// prints line with goodbye message
		System.out.println(" Bye have a nice day! ");

	}

}

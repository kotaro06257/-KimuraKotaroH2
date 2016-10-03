/**
 *
 */
package homework2;

/**
 * @author Kotaro Kimura
 *
 */
import java.util.Scanner;

public class testHW2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		babylonian t1 = new babylonian(0);

		System.out.println("Enter a number: ");

		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();

		double g = n / 2;

		System.out.println("Result: " + t1.Result(g, n));

	}

}

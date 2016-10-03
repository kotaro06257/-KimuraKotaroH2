/**
 *
 */
package homework2;

/**
 * @author Kotaro
 *
 */
public class babylonian {

	private double x;

	public babylonian(double newX) {
		setX(newX);

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double Result(double g1, double x) {
		double result = g1;
		double result1 = 0.0;
		double div = x / g1;
		result1 = (g1 + div) / 2;
		if (Double.compare(result1, result) != 0) {
			result = result1;
			return Result(result1, x);
		} else {
			return result;
		}

	}
}

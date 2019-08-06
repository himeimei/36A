/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */
public class Xy {
	public static void main(String[] args) {
		double x, y;
		System.out.println("x\ty");
		for(x = -5; x <= 5; x += 0.5) {
			y = Math.pow(x, 5);
			System.out.printf(x + "\t" +"%.1f", y);
			System.out.println();
		}
	}
}

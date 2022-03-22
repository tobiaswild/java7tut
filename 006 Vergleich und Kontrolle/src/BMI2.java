
public class BMI2 {

	public static void main(String[] args) {
		double g = 85;
		double l = 1.87;
		double bmi = g / (l * l);
		if (bmi < 18.5) {
			System.out.println("Untergewicht");
		} else if (bmi > 25) {
			System.out.println("Übergewicht");
		} else {
			System.out.println("Normalgewicht");
		}
		System.out.println(bmi);

	}

}

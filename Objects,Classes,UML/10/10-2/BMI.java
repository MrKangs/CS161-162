/*10.2 (The BMI class) Add the following new constructor in the BMI class:
/** Construct a BMI with the specified name, age, weight,
 * feet, and inches

public BMI(String name, int age, double weight, double feet,
double inches) */

public class BMI{
	private String name;
	private int age;
	private double weight;	// In pounds
	private double height;	// In inches
	public static final double KgtoPound = 0.45359237;
	public static final double MtoInch = 0.0254;
	public static final int InchtoFt = 12;

	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}

	public BMI(String name, int age, double weight, double feet,
		double inches) {
		this(name, age, weight, inches + feet * 12);
	}

	public double getBMI() {
		double bmi = weight * KgtoPound /
			((height * MtoInch) * (height *  MtoInch));
		return Math.round(bmi * 100) / 100.0;
	}

	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 18.5)
			return "Underweight";
		else if (bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "Overweight";
		else
			return "Obese";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
}
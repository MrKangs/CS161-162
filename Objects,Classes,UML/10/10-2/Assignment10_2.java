public class Assignment10_2 {
	public static void main(String[] args) {
		BMI bmi1 = new BMI("Kenneth Kang", 17, 145, 5, 10);
		System.out.println("The BMI for " + bmi1.getName() + " is "
			+ bmi1.getBMI() + " " + bmi1.getStatus());

		BMI bmi2 = new BMI("Kathryn Kang", 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is "
			+ bmi2.getBMI() + " " + bmi2.getStatus());
	}
}
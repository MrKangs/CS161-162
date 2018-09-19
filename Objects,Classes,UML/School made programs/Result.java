public class Result{
	public static void main(String args[]){
		Cone cone = new Cone();
		Cuboid cuboid = new Cuboid();

		System.out.println(cone.calculateVolume(23,12));
		System.out.println();
		System.out.println(cuboid.calculateVolume(23,12));
	}
}
import java.util.*;
public class exercise13_1{
	public static void main(String [] args){

	Random rd = new Random();
	String ant [] = {"Head","Thorax","Propodeum","Node","Petiole","Gaster"};
	List<String> list1 = new ArrayList<String>();

	for(String x: ant)
	list1.add(x);

	list1.remove(rd.nextInt(5));

	for(int i = 0; i<list1.size();i++){
		System.out.printf("%s ", list1.get(i));
	}
}
}
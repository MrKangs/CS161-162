import java.util.*;

public class collections{
	public static void main(String [] args){
		String color[] = {"red","blue","green","blue"};
		List<String> list1 = new ArrayList<String>();

		//add items to the list
		for(String x: color)
		list1.add(x);

		//add array items to the list
		String[] color2 = {"red","white"};
		List<String> list2 = new ArrayList<String>();

		for(String y:color2)
		list2.add(y);

		for(int i = 0; i<list2.size();i++){
			System.out.printf("%s", list1.get(i));
		}

		editlist(list1, list2);
		System.out.println();


		//print out list1
		for(int i=0; i<list1.size();i++){
			System.out.printf("%s", list1.get(i));
			}
		}

		public static void editlist(Collection<String> l1, Collection<String> l2){
			Iterator<String> something = l1.iterator();
			while(something.hasNext()){
				if(l2.contains(something.next()))
				something.remove();
			}
		}
	}
package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Arul");
	list.add("Anand");
	list.add("Manoj");
	list.add("Prakash");
	list.add("Rajalingam");
	list.forEach(action -> System.out.println(list));
	
}
}

import java.util.Comparator;
import java.util.*;

public class SortObjectLists implements Comparable<SortObjectLists>{
	
	private String fruitName;
	private int quantity;

	public SortObjectLists(String fruitName, int quantity){
		this.fruitName = fruitName;
		this.quantity = quantity;
	}
	public int getQuantity(){
		return quantity;
	}

	public int compareTo(SortObjectLists compareFruit){
		int compareQuantity = ((SortObjectLists) compareFruit).getQuantity();

		return this.quantity - compareQuantity;
	}


	public static void main(String args[]){
		List<SortObjectLists> fr = new ArrayList<SortObjectLists>();
		SortObjectLists fruit1 = new SortObjectLists("apple", 10);
		fr.add(fruit1);
		SortObjectLists fruit2 = new SortObjectLists("apple", 8);
		fr.add(fruit2);
		SortObjectLists fruit3 = new SortObjectLists("banana", 7);
		fr.add(fruit3);
		SortObjectLists fruit4 = new SortObjectLists("grapes", 8);
		fr.add(fruit4);
		SortObjectLists fruit5 = new SortObjectLists("oranges", 2);
		fr.add(fruit5);

		Collections.sort(fr);

		for(SortObjectLists as: fr){
		System.out.println(as.fruitName + " , " + as.quantity);
		}

	}
}




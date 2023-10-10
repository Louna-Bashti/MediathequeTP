package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items) {
			ItemVisitor p = new Print();
			i.accept(p);
		}
	}
	
	public void printOnlyBooks() {
		System.out.println("Livres :");
		for (Item i : items) {
			ItemVisitor p = new PrintBook();
			i.accept(p);
			}





	}

	public void printOnlyCDs() {
		System.out.println("CDs :");
		for (Item i : items) {
			ItemVisitor p = new PrintCD();
			i.accept(p);
		}
	}

}

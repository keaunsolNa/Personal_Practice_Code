package iterator_Pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	ArrayList menus;
	
//	Menu pancakeHouseMenu;
//	Menu dinerMenu;
//	Menu cafeMenu;
	
	public Waitress(ArrayList menus) {
		this.menus = menus;
	}
	
//	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
//		this.pancakeHouseMenu = pancakeHouseMenu;
//		this.dinerMenu = dinerMenu;
//		this.cafeMenu = cafeMenu;
//	}
	
	public void printMenu() {
		Iterator menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.createIterator());
		}
	}
	
	
//	public void printMenu() {
//		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
//		
//		System.out.println("메뉴\n~~~\n아침 메뉴");
//		printMenu(pancakeIterator);
//		System.out.println("\n점심 메뉴");
//		printMenu(dinerIterator);
//		System.out.println("\n저녁 메뉴");
//		printMenu(cafeIterator);
//	}

	void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
//	private void printMenu(Iterator<MenuItem> iterator) {
//		while(iterator.hasNext()) {
//			MenuItem menuItem = iterator.next();
//			System.out.print(menuItem.getName() + ", ");
//			System.out.print(menuItem.getPrice() + " -- ");
//			System.out.println(menuItem.getDescription());
//		}
//		
//	}
}

package com.prototype.design.pattern;

public class Demo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bookShop = new BookShop();
		
		bookShop.setShopName("Noval");
		bookShop.loadData();
		
		BookShop bookShop1 = bookShop.clone();
		
		bookShop.getBook().remove(2);
		
		bookShop1.setShopName("ram");
		System.out.println(bookShop);
		
		System.out.println(bookShop1);
	}

}

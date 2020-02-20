package com.prototype.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	private String shopName;

	List<Book> book = new ArrayList<Book>();

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public void loadData() {

		for (int i = 0; i < 10; i++) {

			Book b = new Book();

			b.setBid(i);
			b.setBname("Book " + i);

			getBook().add(b);
		}
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", book=" + book + "]";
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		BookShop bs = new BookShop();
		
		for (Book book2 : getBook()) {
			bs.getBook().add(book2);
			
		}
		
		return bs;
	}
	
	

}

package thi;

import java.io.Serializable;

public class Book implements Serializable{
	
		private String code;
		private String title;
		private String author;
		private int price;
		public Book() {
			
		}
		public Book(String code, String title, String author, int price) {
			super();
			this.code = code;
			this.title = title;
			this.author = author;
			this.price = price;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		
}

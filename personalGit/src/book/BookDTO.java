package book;

public class BookDTO {

	private int number;
	private String name;
	private String author;
	private String publisher;
	private int price;
	
	public BookDTO() {
	}
	
	@Override
	public String toString() {
		return "BookDTO [number=" + number + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + "]";
	}

	public BookDTO(int number, String name, String author, String publisher, int price) {
		this.number = number;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	int getNumber() {
		return number;
	}
	void setNumber(int number) {
		this.number = number;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	String getPublisher() {
		return publisher;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
}

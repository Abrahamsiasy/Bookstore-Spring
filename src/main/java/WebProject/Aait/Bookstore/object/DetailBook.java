package WebProject.Aait.Bookstore.object;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

//INSERT INTO `bookaait`.`book` 
//		(`id`, 
//		`author`, 
//		`isbn`, 
//		`price`, 
//		`title`, 
//		`year`, 
//		`libid`)
//		VALUES ('1', 
//		 'Aait', 
//		 '120', 
//		 '120', '
//		 Spring boot in action', 
//		 '2013', 
//		 '1');

@Entity
public class DetailBook {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long bookId;
	private int bookisbn;
	private String bookTitle, bookAuthor;
	private int bookyear;
	private float bookprice;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="libID")
	private UserLibrary library;
	
	
	public DetailBook(){}
	
	public DetailBook( int isbn, String title, String author, int year, float price, UserLibrary library) {
		super();
		this.bookisbn = isbn;
		this.bookTitle = title;
		this.bookAuthor = author;
		this.bookyear = year;
		this.bookprice = price;
		this.library = library;
	}
//(`id`, `author`, `isbn`, `price`, `title`, `year`, `libid`) VALUES ('1', 'Aait', '120', '120', 'Spring boot in action', '2013', '1');

	public Long getId() {
		return bookId;
	}

	public void setId(Long id) {
		this.bookId = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String title) {
		this.bookTitle = title;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String author) {
		this.bookAuthor = author;
	}
	public int getBookYear() {
		return bookyear;
	}
	public void setBookYear(int year) {
		this.bookyear = year;
	}
	public int getBookIsbn() {
		return bookisbn;
	}
	public void setBookIsbn(int isbn) {
		this.bookisbn = isbn;
	}
	public float getBookPrice() {
		return bookprice;
	}
	public void setBookPrice(float price) {
		this.bookprice = price;
	}
	
	public UserLibrary getLibrary() {
		return library;
	}

	public void setLibrary(UserLibrary library) {
		this.library = library;
	}
	//(`id`, `author`, `isbn`, `price`, `title`, `year`, `libid`) VALUES ('1', 'Aait', '120', '120', 'Spring boot in action', '2013', '1');

	@Override
	public String toString() {
		if(this.library!=null){
			return "Book [id=" + bookId 
					+ ", isbn=" + bookisbn 
					+ ", title=" + bookTitle 
					+ ", author=" + bookAuthor 
					+ ", year=" + bookyear
					+ ", price=" + bookprice 
					+ ", library=" + this.getLibrary() + "]";
		}
		else {
			return "Book [id=" + bookId 
					+ ", isbn=" + bookisbn 
					+ ", title=" + bookTitle 
					+ ", author=" + bookAuthor 
					+ ", year=" + bookyear
					+ ", price=" + bookprice+"]";
		}
	}


	
	
}

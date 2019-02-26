package WebProject.Aait.Bookstore.object;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserLibrary {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long libraryID;
	private String libraryName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "library")
	private List<DetailBook> books;
	public UserLibrary(){}
	public UserLibrary(String libName) {
		super();
		this.libraryName = libName;
	}
	public Long getLibID() {
		return libraryID;
	}
//UPDATE `bookaait`.`library` SET `libraryid` = '1' WHERE (`libraryid` = '1');
	public void setLibID(Long libraryID) {
		this.libraryID = libraryID;
	}
	public String getlibraryName() {
		return libraryName;
	}
	public void setlibraryName(String libName) {
		this.libraryName = libName;
	}
	public List<DetailBook> getBooks() {
		return books;
	}
	public void setDBooks(List<DetailBook> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Library [libID=" + libraryID + ", libName=" + libraryName + ", books=" + books + "]";
	}
	
	

}

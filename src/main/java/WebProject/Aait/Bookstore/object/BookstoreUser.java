package WebProject.Aait.Bookstore.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


//user witrh databases
@Entity
public class BookstoreUser {
	@Id
	@GeneratedValue
	@Column(name="id", nullable=false,updatable=false)
	private Long bookId;
	
	//Username
	@Column(name="username", nullable=false)
	private String username;
	
	@Column(name = "password", nullable = false)
    private String hashedPass;

    @Column(name = "role", nullable = false)
    private String role;
    
    public BookstoreUser() {
    }
// possword hashed 
	public BookstoreUser(String username, String passwordHash, String role) {
		super();
		this.username = username;
		this.hashedPass = passwordHash;
		this.role = role;
	}

	
//	@Table(name = "role")
//	public class Role {
//	    @Id
//	    @GeneratedValue(strategy = GenerationType.AUTO)
//	    @Column(name = "role_id")
//	    private int id;
//	    @Column(name = "role")
//	    private String role;
//	}
//	
//	
	
	
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long id) {
		this.bookId = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHashPassword() {
		return hashedPass;
	}

	public void setHashPassword(String passwordHash) {
		this.hashedPass = passwordHash;
	}

	public String getUserRole() {
		return role;
	}

	public void setUserRole(String role) {
		this.role = role;
	}
	
}

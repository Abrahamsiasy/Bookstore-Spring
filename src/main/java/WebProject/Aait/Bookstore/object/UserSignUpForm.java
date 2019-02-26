package WebProject.Aait.Bookstore.object;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
//sign up form with validation 



//@Table(name = "role")
//public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "role_id")
//    private int id;
//    @Column(name = "role")
//    private String role;
//}

public class UserSignUpForm {
	@NotEmpty
	@Size(min=6,max=20)
	private String username="";
// userNAme 
	@NotEmpty
    @Size(min=6, max=50)
    private String password = "";
//Password
    @NotEmpty
    @Size(min=6, max=50)
    private String passwordCheck = "";
//cheake Password
    @NotEmpty
    private String role = "USER";

	public String getUsername() {
		return username;
	}
//setter & getter methodes 
// we used the previous version of theamleaf
	public void setUName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordCheck() {
		return passwordCheck;
	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
}

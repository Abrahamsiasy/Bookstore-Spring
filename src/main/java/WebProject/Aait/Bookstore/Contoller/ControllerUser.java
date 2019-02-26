package WebProject.Aait.Bookstore.Contoller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import WebProject.Aait.Bookstore.Repository.BookstoreUserRepository;
import WebProject.Aait.Bookstore.object.UserSignUpForm;
import WebProject.Aait.Bookstore.object.BookstoreUser;

@Controller
public class ControllerUser {
	@Autowired
	private BookstoreUserRepository repository;
	
	@RequestMapping(value="signup")
	public String addUser(Model model){
		model.addAttribute("signUpForm", new UserSignUpForm());
		return "signup";
	}
	
	
	@RequestMapping(value="saveuser",method = RequestMethod.POST)
	public String save (@Valid @ModelAttribute("signUpForm") UserSignUpForm signupForm, BindingResult binding){
		if (!binding.hasErrors()) {
			if (signupForm.getPassword().equals(signupForm.getPasswordCheck())) {
				String pwd=signupForm.getPassword();
				BCryptPasswordEncoder bc= new BCryptPasswordEncoder();
				String hashPwd= bc.encode(pwd);
				
				BookstoreUser newUser= new BookstoreUser();
				newUser.setHashPassword(hashPwd);
				newUser.setUsername(signupForm.getUsername());
				newUser.setUserRole("USER");
				if (repository.findByUsername(signupForm.getUsername())==null) {
					repository.save(newUser);
				}
				else {
					binding.rejectValue("username","err.username", "Username already existed");
					return "signup";
				}
			}
			else {
				binding.rejectValue("passwordCheck", "err.passCheck", "Passwords do not match");
				return "signup";
			}
		}
		else {
			return "signup";
		}
		return "redirect:/login";
	}
}

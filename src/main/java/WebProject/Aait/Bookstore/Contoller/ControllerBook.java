package WebProject.Aait.Bookstore.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import WebProject.Aait.Bookstore.Repository.BookRepository;
import WebProject.Aait.Bookstore.Repository.LibraryRepository;
import WebProject.Aait.Bookstore.object.DetailBook;

@Controller
public class ControllerBook {
	
	@Autowired 
	private LibraryRepository lrepository;
	
	@Autowired
	private BookRepository repository;
	
	@RequestMapping(value="/")
	public String homePage(){
		return "home";
	}
	
	@RequestMapping(value="/login")
	public String Userlogin(){
		return "login";
	}
	//Restful Service to get all books
	@RequestMapping(value="/books",method= RequestMethod.GET)
	public @ResponseBody List<DetailBook> bookRest(){
		return (List<DetailBook>) repository.findAll();
	}
	@RequestMapping(value="/bookList")
	public String bookList(Model model){
		model.addAttribute("books", repository.findAll());
		return "bookList";
	}
	

	

	
	//Restful Service to get Student by ID
	
	
	//Add a new book
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String showBook(Model model){
		model.addAttribute("book", new DetailBook());
		model.addAttribute("libraries", lrepository.findAll());
		return "addBook";
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping (value="/delete/{id}", method=RequestMethod.GET)
	public String deleteBook(@PathVariable("id") long id, Model model){
		repository.delete(id);
		return "redirect:../bookList";
	}
	
	@RequestMapping (value="/save", method=RequestMethod.POST)
	public String saveBook(DetailBook book){
		repository.save(book);
		return "redirect:bookList";
	}
	

	
}

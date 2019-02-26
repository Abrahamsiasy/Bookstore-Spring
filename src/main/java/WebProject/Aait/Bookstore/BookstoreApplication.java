package WebProject.Aait.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import WebProject.Aait.Bookstore.Repository.BookRepository;
import WebProject.Aait.Bookstore.Repository.LibraryRepository;
import WebProject.Aait.Bookstore.Repository.BookstoreUserRepository;
import WebProject.Aait.Bookstore.object.DetailBook;
import WebProject.Aait.Bookstore.object.UserLibrary;
import WebProject.Aait.Bookstore.object.BookstoreUser;



@SpringBootApplication
public class BookstoreApplication extends SpringBootServletInitializer{
	
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BookstoreApplication.class);
    }
	
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, LibraryRepository lrepository, BookstoreUserRepository urepository){
		return (args) -> {
			log.info("Save a couple of books");
			lrepository.save(new UserLibrary("Candy"));
			lrepository.save(new UserLibrary("5 Killo"));
			lrepository.save(new UserLibrary("4 Killo"));
			

////		    Create users fror users and admin:
////			fror user   uesername == user 
////						password == user
////		    For admoin username == admin
///		    		password == admin
////				
////			
////		
////		
////	
			BookstoreUser user1 = new BookstoreUser("user", "$2a$06$eL6DBdC894FJsNOzvk6vsuMGRUn.VFoSpBH2k4HLv4sghiBtZivAy", "USER");
			BookstoreUser user2 = new BookstoreUser("admin", "$2a$06$8fdX7nZReXdIk5MBGMipCuTasV5JcWc92zcJ1blt6SjmK9xL8pzaG", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			
			log.info("Fetch some books");
			for(DetailBook book: repository.findAll()){
				log.info(book.toString());
			}
		};
	}
	
}

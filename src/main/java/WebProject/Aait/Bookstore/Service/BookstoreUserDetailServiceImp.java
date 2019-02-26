package WebProject.Aait.Bookstore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import WebProject.Aait.Bookstore.Repository.BookstoreUserRepository;
import WebProject.Aait.Bookstore.object.BookstoreUser;


 //used by spring security to authenticate and authorize user
 
@Service
public class BookstoreUserDetailServiceImp implements UserDetailsService  {
	private final BookstoreUserRepository repository;

	@Autowired
	public BookstoreUserDetailServiceImp(BookstoreUserRepository userRepository) {
		this.repository = userRepository;
	}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {   
    	BookstoreUser curruser = repository.findByUsername(username);
        UserDetails user = new org.springframework.security.core.userdetails.User(username, curruser.getHashPassword(), 
        		AuthorityUtils.createAuthorityList(curruser.getUserRole()));
        return user;
    }   
} 

package WebProject.Aait.Bookstore.Repository;

import org.springframework.data.repository.CrudRepository;

import WebProject.Aait.Bookstore.object.BookstoreUser;
//UserRepository
public interface BookstoreUserRepository extends CrudRepository<BookstoreUser, Long> {
	//findByUsername
	BookstoreUser findByUsername(String username);
}

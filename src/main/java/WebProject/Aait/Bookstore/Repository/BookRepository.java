package WebProject.Aait.Bookstore.Repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import WebProject.Aait.Bookstore.object.DetailBook;
//BookRepository
public interface BookRepository extends CrudRepository<DetailBook, Long> {
	
	List <DetailBook> findBytitle(String title);
	//findBytitle

}

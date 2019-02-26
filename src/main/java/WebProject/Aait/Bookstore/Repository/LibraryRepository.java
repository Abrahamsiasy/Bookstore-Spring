package WebProject.Aait.Bookstore.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import WebProject.Aait.Bookstore.object.UserLibrary;
//LibraryRepository
public interface LibraryRepository extends CrudRepository<UserLibrary, Long>{
	//findByLibName
	List<UserLibrary> findByLibName(String name);
	
}

package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Gk5
 * Date: 2022-06-26
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

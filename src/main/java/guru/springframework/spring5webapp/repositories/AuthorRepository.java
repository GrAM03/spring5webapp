package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Gk5
 * Date: 2022-06-26
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}

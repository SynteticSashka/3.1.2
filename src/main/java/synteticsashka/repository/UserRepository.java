package synteticsashka.repository;

import org.springframework.data.repository.CrudRepository;
import synteticsashka.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}

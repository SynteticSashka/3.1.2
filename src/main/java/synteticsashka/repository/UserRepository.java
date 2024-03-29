package synteticsashka.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import synteticsashka.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}

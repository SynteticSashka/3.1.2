package synteticsashka.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import synteticsashka.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}

package synteticsashka.service;

import synteticsashka.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    void createRoles(Set<Role> roles);
    Set<Role> getAllRoles();
}

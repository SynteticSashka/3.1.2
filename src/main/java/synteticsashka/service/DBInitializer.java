package synteticsashka.service;

import org.springframework.stereotype.Component;
import synteticsashka.model.Role;
import synteticsashka.model.User;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Set;

@Component
public class DBInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DBInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    private void init() {
        roleService.addRole(new Role("ADMIN"));
        roleService.addRole(new Role("USER"));

        User commonUser = new User();
        commonUser.setName("CommonUserName");
        commonUser.setLastName("CommonUserLastName");
        commonUser.setEmail("user@email.com");
        commonUser.setPassword("CommonUserPassword");
        commonUser.setRoles(Set.of(roleService.getRoleByName("USER")));
        userService.updateUser(commonUser);

        User uncommonUser = new User();
        uncommonUser.setName("UncommonUserName");
        uncommonUser.setLastName("UncommonUserLastName");
        uncommonUser.setEmail("user@email.com");
        uncommonUser.setPassword("UncommonUserPassword");
        uncommonUser.setRoles(Set.of(roleService.getRoleByName("ADMIN"), roleService.getRoleByName("USER")));
        userService.updateUser(uncommonUser);

        User admin = new User();
        admin.setName("AdminName");
        admin.setLastName("AdminLastName");
        admin.setEmail("admin@email.com");
        admin.setPassword("AdminPassword");
        admin.setRoles(Set.of(roleService.getRoleByName("ADMIN")));
        userService.updateUser(admin);
    }
}

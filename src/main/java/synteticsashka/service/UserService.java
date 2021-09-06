package synteticsashka.service;

import synteticsashka.model.User;

import java.util.List;

public interface UserService {

    void deleteUser(long id);

    void updateUser(User user);

    List<User> getUsers();

    User getUserById(long id);

    User getUserByName(String name);
}

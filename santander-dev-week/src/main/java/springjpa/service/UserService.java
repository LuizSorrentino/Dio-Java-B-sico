package springjpa.service;

import springjpa.model.User;

import java.util.List;

public interface UserService {
    public User findById(Long id);
    public User create(User userToCreate);
    public List<User> findAll();
    public User save(User user);
    public String deleteById(Long id);
}

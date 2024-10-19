package springjpa.service.impl;

import org.springframework.stereotype.Service;
import springjpa.model.User;
import springjpa.repository.UserRepository;
import springjpa.service.UserService;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("User ID already exists!");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public List<User> findAll() {

        return null;
    }

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public String deleteById(Long id) {
        userRepository.deleteById(id);
        return "User deleted";
    }
}

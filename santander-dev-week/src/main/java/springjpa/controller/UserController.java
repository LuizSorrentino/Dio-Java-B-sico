package springjpa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import springjpa.model.User;
import springjpa.repository.UserRepository;
import springjpa.service.UserService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping()
    public ResponseEntity<User> create(@RequestBody User userToCreate) {
        var userCreated = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();

        return ResponseEntity.created(location).body(userCreated);
    }

    @DeleteMapping
    public ResponseEntity<User> deleteById(@RequestBody User userToDelete) {
        userService.deleteById(userToDelete.getId());
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @PutMapping()
    public ResponseEntity<User> update(@RequestBody User userToUpdate) {
        return null;
    }
}

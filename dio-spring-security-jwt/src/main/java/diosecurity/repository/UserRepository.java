package diosecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import diosecurity.model.User;



public interface UserRepository extends JpaRepository<User, Integer>{
    @Query
    public User findByUsername(@Param("username") String username);
    boolean existsByUsername(String Username);
    public void save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);
    
}

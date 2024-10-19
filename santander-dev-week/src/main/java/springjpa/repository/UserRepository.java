package springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springjpa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

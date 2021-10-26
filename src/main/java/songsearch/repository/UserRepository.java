package songsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import songsearch.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

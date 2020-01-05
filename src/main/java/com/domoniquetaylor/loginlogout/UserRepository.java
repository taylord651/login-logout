package com.domoniquetaylor.loginlogout;

import com.domoniquetaylor.loginlogout.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}

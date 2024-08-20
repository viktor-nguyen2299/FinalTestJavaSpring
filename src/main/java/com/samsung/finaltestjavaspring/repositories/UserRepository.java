package com.samsung.finaltestjavaspring.repositories;

import com.samsung.finaltestjavaspring.repositories.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

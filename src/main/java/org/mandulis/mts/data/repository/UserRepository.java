package org.mandulis.mts.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.mandulis.mts.data.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findById(long id);
}
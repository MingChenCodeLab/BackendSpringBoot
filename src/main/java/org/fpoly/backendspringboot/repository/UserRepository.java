package org.fpoly.backendspringboot.repository;

import org.fpoly.backendspringboot.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

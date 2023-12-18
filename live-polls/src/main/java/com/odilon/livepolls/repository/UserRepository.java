package com.odilon.livepolls.repository;

import com.odilon.livepolls.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

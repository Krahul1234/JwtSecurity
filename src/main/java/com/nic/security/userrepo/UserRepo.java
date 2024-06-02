package com.nic.security.userrepo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nic.security.dto.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
	 public Optional<User> findByEmail(String email);

}

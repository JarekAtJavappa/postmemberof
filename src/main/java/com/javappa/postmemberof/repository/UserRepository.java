package com.javappa.postmemberof.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javappa.postmemberof.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);
}

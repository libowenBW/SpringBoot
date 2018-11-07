package com.bobby.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bobby.spring.boot.blog.domain.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
	
}

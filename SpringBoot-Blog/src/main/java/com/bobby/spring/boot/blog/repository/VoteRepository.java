package com.bobby.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bobby.spring.boot.blog.domain.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
	
}

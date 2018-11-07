package com.bobby.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bobby.spring.boot.blog.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}

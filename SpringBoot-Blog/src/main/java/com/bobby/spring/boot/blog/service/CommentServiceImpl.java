package com.bobby.spring.boot.blog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobby.spring.boot.blog.domain.Comment;
import com.bobby.spring.boot.blog.repository.CommentRepository;


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;
    
	@Override
	public Optional<Comment> getCommentById(Long id) {
		return commentRepository.findById(id);
	}

	@Override
	public void removeComment(Long id) {
		commentRepository.deleteById(id);
	}

}

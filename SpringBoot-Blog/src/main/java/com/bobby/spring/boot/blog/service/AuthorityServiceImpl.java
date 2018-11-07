package com.bobby.spring.boot.blog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobby.spring.boot.blog.domain.Authority;
import com.bobby.spring.boot.blog.repository.AuthorityRepository;


@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityRepository authorityRepository;

	@Override
	public Optional<Authority> getAuthorityById(Long id) {
		return authorityRepository.findById(id);
	}

}

package com.bobby.spring.boot.blog.service;

import java.util.Optional;

import com.bobby.spring.boot.blog.domain.Authority;



public interface AuthorityService {
	/**
	 * 根据ID查询 Authority
	 * @param id
	 * @return
	 */
	Optional<Authority> getAuthorityById(Long id);
}

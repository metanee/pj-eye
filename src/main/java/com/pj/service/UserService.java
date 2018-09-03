package com.pj.service;

import java.util.Set;

import com.pj.model.User;
import com.pj.model.UserRole;

public interface UserService {

	 User createUser(User user, Set<UserRole> userRoles);
	 
	 User findByUsername(String username);
	 User findByEmail (String email);
	 
	 User save(User user);
	 
	 User findById(Long id);
}

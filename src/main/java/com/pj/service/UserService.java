package com.pj.service;

import java.util.Set;

import com.pj.model.User;
import com.pj.model.UserRole;

public interface UserService {

	public User createUser(User user, Set<UserRole> userRoles);
}

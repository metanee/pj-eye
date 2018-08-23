package com.pj.model;

import java.io.Serializable;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority, Serializable{
	
	private static final long servialVersionUID = 123123L;	

	private static String authority;

	public Authority (String authority) {
	
		this.authority = authority;
	}

	@Override
	public String getAuthority(){
		return authority;
	}

}

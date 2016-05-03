package com.warmane.dao;

import com.warmane.model.Role;


public interface RoleDao {
	
    public Role findRoleByName(String name);
}


package com.warmane.dao;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.warmane.mapper.RoleMapper;
import com.warmane.model.Role;


@Component
public class RoleDaoImpl implements RoleDao{
    @Resource
	private RoleMapper roleMapper;
	@Override
	public Role findRoleByName(String name) {
	    Role role = roleMapper.selectRoleByName(name);
		return role; 
	}
	
}

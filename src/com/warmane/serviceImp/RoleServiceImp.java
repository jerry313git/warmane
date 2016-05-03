package com.warmane.serviceImp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.warmane.dao.RoleDao;
import com.warmane.model.Role;
import com.warmane.service.RoleService;

@Service
public class RoleServiceImp implements RoleService {
    
    @Resource
    private RoleDao roleDao;
    
    @Override
    public Role findRoleByName(String name) {
        return roleDao.findRoleByName(name);
    }

}

package com.warmane.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class Role {
    
    private Integer id;
    private Integer relateRoleId;
	private String roleName;
	private List<Role> alts;

	
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRelateRoleId() {
        return relateRoleId;
    }

    public void setRelateRoleId(Integer relateRoleId) {
        this.relateRoleId = relateRoleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Role> getAlts() {
        return alts;
    }

    public void setAlts(List<Role> alts) {
        this.alts = alts;
    }
}

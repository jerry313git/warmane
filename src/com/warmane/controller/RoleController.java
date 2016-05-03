package com.warmane.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.warmane.model.Role;
import com.warmane.service.RoleService;

@Controller
public class RoleController {
    
    @Resource 
    private RoleService roleService;
    
	@RequestMapping(value="/findRole")
	public String getRole(HttpServletRequest request){	
	    String name = request.getParameter("name");
	    Role role = roleService.findRoleByName(name);
		return "findRole";
	}
	@RequestMapping("/")
	public String getIndex(){	
		return "index";
	}

}

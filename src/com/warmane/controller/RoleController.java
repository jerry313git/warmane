package com.warmane.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warmane.model.Role;
import com.warmane.service.RoleService;

@Controller
public class RoleController {
    
    @Resource 
    private RoleService roleService;
    
    @RequestMapping(value="/toFindRole")
	public String toFindRole(){	
		return "findRole";
	}
    
	@RequestMapping(value="/getRole")
	@ResponseBody
	public List<String> getRole(HttpServletRequest request){	
	    String name = request.getParameter("name");
	    Role role = roleService.findRoleByName(name);
	    List<String> result = new ArrayList<String>();
	    result.add(role.getRoleName());
	    for(Role alt:role.getAlts()) {
	    	result.add(alt.getRoleName());
	    }
		return result;
	}
	@RequestMapping("/")
	public String getIndex(){	
		return "index";
	}

}

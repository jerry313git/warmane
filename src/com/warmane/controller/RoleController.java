package com.warmane.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.warmane.model.Role;
import com.warmane.service.RoleService;

@Controller
public class RoleController {
    
    @Resource
    private RoleService roleService;
    
    @RequestMapping("/")
    public String getIndex(){   
        return "index";
    }
    
	@RequestMapping(value="/toFindRole")
	public String toFindRole(){	
		return "findRole";
	}
	
	@RequestMapping(value="/getRole")
	@ResponseBody
    public List<String> getRole(HttpServletRequest request,HttpServletResponse resp){ 
	    List<String> result = new ArrayList<String>();
	    String name = request.getParameter("name");
	    Role role = roleService.findRoleByName(name); 
	    List<Role> alts = role.getAlts();
	    result.add(role.getRoleName());
	    for(Role alt:alts) {
	        result.add(alt.getRoleName());
	    }
	    return result;
	}
}

package com.gangfive.sima.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/layoutservice")
public class LayoutController {			
	
	@RequestMapping(value = "/{layoutName}")
	public String getLayout(@PathVariable String layoutName)
	{
		return "layouts/"+layoutName;
	}

	@RequestMapping(value = "/loginlayout")
	public String getLoginLayout()
	{
		return "layouts/login";
	}
	
	@RequestMapping(value = "/userslayout")
	public String getUsersLayout()
	{
		return "layouts/users";
	}
	
	@RequestMapping(value = "/user/createUserModal")
	public String getCreateUserModal()
	{
		return "modals/createUserModal";
	}
	
	@RequestMapping(value = "/user/editUserModal")
	public String getEditUserModal()
	{
		return "modals/editUserModal";
	}
	
	@RequestMapping(value = "/rent/list")
	public String getRentListLayout()
	{
		return "layouts/rentList";
	}
	
	@RequestMapping(value = "/rent/create")
	public String getRentCreateLayout()
	{
		return "layouts/rentCreate";
	}
	
	@RequestMapping(value = "/rent/do")
	public String getRentDoLayout()
	{
		return "layouts/rentDo";
	}

}

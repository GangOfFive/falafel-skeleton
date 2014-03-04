package com.gangfive.sima.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/layouts")
public class LayoutController {			
	
	@RequestMapping(value = "/{layoutName}")
	public String getLayout(@PathVariable String layoutName)
	{
		return "layouts/"+layoutName;
	}
}

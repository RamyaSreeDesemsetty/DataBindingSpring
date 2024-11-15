package com.mayas.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.mayas.config.UserInfoDto;

@Controller
@SessionAttributes("userInfo")
public class DataController {
	UserInfoDto userInfo = new UserInfoDto();
	String s1="Haribabu";
	
@RequestMapping("/home")	
public String showHomePage(Model model)
{
	 
	model.addAttribute("userInfo",userInfo);
	return "formpage";
	
}
@RequestMapping("/processwelcome")
public String showResult(UserInfoDto userInfoDto,Model model)
{
	
	model.addAttribute("userInfo",userInfoDto);
	return "welcamepage";
	
}
@RequestMapping("/third")

public ModelAndView showThird( UserInfoDto userInfoDto,Model model)
{
	
ModelAndView mav = new ModelAndView();
	mav.addObject(userInfo);
	mav.setViewName("thirdpage");
	return mav;
	
}

}
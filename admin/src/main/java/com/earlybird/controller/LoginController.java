package com.earlybird.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.earlybird.entity.CnAdmin;
import com.earlybird.impl.CnAdminServiceImpl;
import com.earlybird.service.ICnAdminService;

import org.apache.log4j.Logger;

//http://localhost:8081/admin/login
@Controller
public class LoginController {
	private static Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private CnAdminServiceImpl  inAdminServiceImpl;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model) {
		logger.info("enter into login");
		return "admin/login";
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request,Model model) {
		logger.info("enter into index");
		
		String userName =request.getParameter("user_name");
		String pwd = request.getParameter("pwd");
		logger.info("userName:"+ JSON.toJSONString(userName) );
		logger.info("pwd:"+ JSON.toJSONString(pwd) );
		
		CnAdmin  cnAdmin  = this.inAdminServiceImpl.login(userName,pwd);
		/** todo 判断 */
		//if(  )
		
		logger.info("cnAdmin:"+ JSON.toJSONString(cnAdmin) );
		
		model.addAttribute("user_name",cnAdmin.getUserName() );
		model.addAttribute("adminInfo", cnAdmin);
		
		return "admin/index";
	}
	
}

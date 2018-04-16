package com.earlybird.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.earlybird.entity.sys.Admin;
import com.earlybird.server.sys.AdminService;

import org.apache.log4j.Logger;

// http://localhost:8081/admin/getAdminInfo?id=21
@Controller
public class AdminController {
	private static Logger logger = Logger.getLogger(AdminController.class);
	
	@Autowired
	private AdminService  adminService;
	
	@RequestMapping("/getAdminInfo")
	public String getAdminInfo(HttpServletRequest request,Model model) {
		int adminId = Integer.parseInt(request.getParameter("id"));
		logger.info("adminId:"+ JSON.toJSONString(adminId) );
		
		Admin  admin  = this.adminService.getAdminInfoByid(adminId);
		logger.info("admin:"+ JSON.toJSONString(admin) );
		
		model.addAttribute("test", "hello test demo");
		model.addAttribute("adminInfo", admin);
		return "admin/index";
	}
}

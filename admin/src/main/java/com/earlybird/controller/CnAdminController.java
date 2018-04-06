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

// http://localhost:8081/admin/getAdminInfo?id=21
@Controller
public class CnAdminController {
	private static Logger logger = Logger.getLogger(CnAdminController.class);
	
	@Autowired
	private CnAdminServiceImpl  inAdminServiceImpl;
	
	@RequestMapping("/getAdminInfo")
	public String getAdminInfo(HttpServletRequest request,Model model) {
		int adminId = Integer.parseInt(request.getParameter("id"));
		logger.info("adminId:"+ JSON.toJSONString(adminId) );
		
		CnAdmin  cnAdmin  = this.inAdminServiceImpl.getAdminInfoByid(adminId);
		logger.info("cnAdmin:"+ JSON.toJSONString(cnAdmin) );
		
		model.addAttribute("test", "hello test demo");
		model.addAttribute("adminInfo", cnAdmin);
		return "admin/index";
	}
}

package org.test.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.test.service.ICnAdminService;

import com.alibaba.fastjson.JSON;

import org.test.entity.CnAdmin;
import org.test.impl.CnAdminServiceImpl;

import org.apache.log4j.Logger;

// http://localhost:8080/test/admin/getAdminInfo?id=1
@Controller
@RequestMapping("/admin")
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
		return "admin/login";
	}
}

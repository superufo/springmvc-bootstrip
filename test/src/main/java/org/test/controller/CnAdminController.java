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

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

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
		return "admin/test";
	}
	
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request,Model model) {
		int adminId =  21 ; /** 配置session Integer.parseInt(request.getParameter("id"));**/
		CnAdmin  cnAdmin  = this.inAdminServiceImpl.getAdminInfoByid(adminId);
		
		logger.info(" enter into Index ");
		logger.info("cnAdmin:"+ JSON.toJSONString(cnAdmin) );
		
		model.addAttribute("adminInfo", cnAdmin);
		return "admin/index";
	}
	
	@RequestMapping("/index2")
	public String index2(HttpServletRequest request,Model model) {
		logger.info(" enter into Index2 ");
		return "admin/index2";
	}
	
	@RequestMapping("/index3")
	public String index3(HttpServletRequest request,Model model) {
		logger.info(" enter into Index3 ");
		return "admin/index3";
	}
	
	
    @RequestMapping("/testFtl")
    public String testFtl(Model model) {
    	String str = "2018/05/15 09:21:35.345xxxxcxc";
    	 
    	SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS");
    	SimpleDateFormat DateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");
    	Date date = new Date();
		try {
			date = DateFormat.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//提取格式中的日期
    	String str1 = DateFormat1.format(date);
    	
    	
    	logger.info("testtime:"+ JSON.toJSONString(str1));
    	logger.info(" enter into testFtl ");
        model.addAttribute("hello", "hello world!");
        model.addAttribute("testtime", date.toString());
        //model.addAttribute("date", str1);
        return "admin/testFtl.html";
    }
}

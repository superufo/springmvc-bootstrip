package com.earlybird.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.fastjson.JSON;
import com.earlybird.common.utils.ObjectUtils;
import com.earlybird.common.utils.StringUtils;
import com.earlybird.common.utils.Md5Utils;

import com.earlybird.entity.CnAdmin;
import com.earlybird.impl.CnAdminServiceImpl;

//http://localhost:8081/admin/login
@Controller
public class LoginController {
	private static Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private CnAdminServiceImpl  inAdminServiceImpl;
	
	//@Autowired
	//private ObjectUtils objectUtils;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model) {
		logger.info("enter into login");
		return "admin/login";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String index(Model model,@Valid @ModelAttribute("cnAdmin") CnAdmin cnAdmin,BindingResult result,RedirectAttributes  redirectAttributes) {
		logger.info("enter into index");
		
		String userName = cnAdmin.getUserName();
		String pwd =  Md5Utils.getMD5(cnAdmin.getPassword());
		logger.info("userName:"+ JSON.toJSONString(userName) );
		logger.info("pwd:"+ JSON.toJSONString(pwd) );
		
		CnAdmin  retCnAdminInfo  = this.inAdminServiceImpl.selectByLoginInfo(userName,pwd);
		logger.info("cnAdminInfo:"+ JSON.toJSONString(retCnAdminInfo) );
		
		/** todo 判断 */
		if( retCnAdminInfo==null  ) {
			logger.info("hint:failure" );
			
			model.addAttribute("errorHint", "用户名或密码错误！");
			return "redirect:login";
		}else {
			logger.info("cnAdminInfo:"+ JSON.toJSONString(retCnAdminInfo) );
			logger.info("hint:succes");
			model.addAttribute("userName",retCnAdminInfo.getUserName() );
			model.addAttribute("adminInfo", retCnAdminInfo);
			return "admin/index";
		}
		
	}
	
	@RequestMapping(value="/index1", method=RequestMethod.POST)
	public String index1(HttpServletRequest request, Model model) {
		logger.info("enter into index");
		
		String userName =request.getParameter("user_name");
		String pwd = request.getParameter("pwd");
		logger.info("userName:"+ JSON.toJSONString(userName) );
		logger.info("pwd:"+ JSON.toJSONString(pwd) );
		
		CnAdmin  cnAdmin  = this.inAdminServiceImpl.selectByLoginInfo(userName,pwd);
		/** todo 判断 */
		if( ObjectUtils.isNullOrEmpty(cnAdmin)==false ) {
			model.addAttribute("errorHint", "用户名或密码错误！");
			return "admin/login";
		}
		
		logger.info("cnAdmin:"+ JSON.toJSONString(cnAdmin) );
		
		model.addAttribute("userName",cnAdmin.getUserName() );
		model.addAttribute("adminInfo", cnAdmin);
		
		return "admin/index";
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

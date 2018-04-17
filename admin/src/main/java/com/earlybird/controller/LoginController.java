package com.earlybird.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
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
import com.earlybird.dao.sys.PermsDao;
import com.earlybird.common.utils.Md5Utils;

import com.earlybird.entity.sys.Admin;
import com.earlybird.entity.sys.Perms;
import com.earlybird.server.sys.AdminService;
import com.earlybird.shiro.cash.RedisManager;
import com.earlybird.system.SysRedisCache;
import com.earlybird.system.SysRedisKey;

import redis.clients.jedis.Jedis;

//http://localhost:8081/admin/login
@Controller
public class LoginController {
	private static Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private AdminService  adminService;
	
	@Autowired
	private PermsDao permsDao;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model) {
		logger.info("enter into login");
		return "admin/login";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String index(Model model,@Valid @ModelAttribute("form") Admin cnAdmin,BindingResult result,RedirectAttributes  redirectAttributes) {
	    Subject currentUser = SecurityUtils.getSubject();
		
		// Try to get session from redis
        Session session = currentUser.getSession();
       
        logger.info("session："+JSON.toJSONString(session.getAttribute(currentUser)));
		
        SysRedisCache sysRedisCache = new SysRedisCache();
        logger.info(" sysRedisCache.getALlPerms："+JSON.toJSONString(sysRedisCache.getALlPerms()));
        
		String userName = cnAdmin.getUserName();
		String pwd =  Md5Utils.getMD5(cnAdmin.getPassword());
		logger.info("userName:"+ JSON.toJSONString(userName) );
		logger.info("pwd:"+ JSON.toJSONString(pwd) );
		
		
		  // let's login the current user so we can check against roles and permissions:
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(userName, pwd);
            try {
                currentUser.login(token);
            } catch (UnknownAccountException uae) {
            	logger.info("There is no user with username of " + token.getPrincipal());
            	return "redirect:error";
            }  catch ( IncorrectCredentialsException ice ) {
            	logger.info("Password for account " + token.getPrincipal() + " was incorrect! error info:"+ice.getMessage());
            	model.addAttribute("exHint", ice.getMessage());
            	return "redirect:refuse";
            }
        }
        logger.info("User [" + currentUser.getPrincipal() + "] logged in successfully.");
		
		
		Admin  retAdminInfo  = this.adminService.selectByLoginInfo(userName,pwd);
		logger.info("cnAdminInfo:"+ JSON.toJSONString(retAdminInfo) );
		
		/** todo 判断 */
		if( retAdminInfo==null  ) {
			logger.info("hint:failure" );
			
			model.addAttribute("errorHint", "用户名或密码错误！");
			return "redirect:login";
		}else {
			logger.info("cnAdminInfo:"+ JSON.toJSONString(retAdminInfo) );
			logger.info("hint:succes");
			model.addAttribute("userName",retAdminInfo.getUserName() );
			model.addAttribute("adminInfo", retAdminInfo);
			return "admin/index";
		}
		
	}
	
	@RequestMapping(value="/refuse", method=RequestMethod.GET)
	public String refuse(HttpServletRequest request, Model model) {
		return "admin/refuse";
	}
	
	@RequestMapping(value="/error", method=RequestMethod.GET)
	public String error(HttpServletRequest request, Model model) {
		return "admin/error";
	}
	
	@RequestMapping(value="/index1", method=RequestMethod.POST)
	public String index1(HttpServletRequest request, Model model) {
		logger.info("enter into index");
		
		String userName =request.getParameter("user_name");
		String pwd = request.getParameter("pwd");
		logger.info("userName:"+ JSON.toJSONString(userName) );
		logger.info("pwd:"+ JSON.toJSONString(pwd) );
		
		Admin  cnAdmin  = this.adminService.selectByLoginInfo(userName,pwd);
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

package org.test.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import org.test.service.ICnAdminService;
import org.test.entity.CnAdmin;

public class testCnAdmin {
	private static Logger logger = Logger.getLogger(testCnAdmin.class);

	@Resource
	private ICnAdminService cnAdminService = null;

	@Test
	public void test1() {
		CnAdmin adminInfo = cnAdminService.getAdminInfoByid(1);
		// System.out.println(user.getUserName());
		logger.info("值：" + adminInfo.getUserName());
		logger.info(JSON.toJSONString(adminInfo));
	}
}

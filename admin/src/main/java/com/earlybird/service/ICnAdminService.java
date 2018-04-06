package com.earlybird.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.earlybird.entity.CnAdmin; 

public interface  ICnAdminService {
	public CnAdmin  getAdminInfoByid(int id);

	public CnAdmin login(String userName,String pwd);
}

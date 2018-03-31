package com.earlybird.service;

import org.springframework.stereotype.Service;

import com.earlybird.entity.CnAdmin; 

public interface  ICnAdminService {
	public CnAdmin  getAdminInfoByid(int id);
}

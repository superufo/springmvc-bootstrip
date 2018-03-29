package org.test.service;

import org.springframework.stereotype.Service;
import org.test.entity.CnAdmin; 

public interface  ICnAdminService {
	public CnAdmin  getAdminInfoByid(int id);
}

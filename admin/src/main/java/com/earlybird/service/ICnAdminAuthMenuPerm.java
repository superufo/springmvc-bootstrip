package com.earlybird.service;

import java.util.ArrayList;
import java.util.Map;

import com.earlybird.entity.CnMenu;
import com.earlybird.entity.CnAdmin;
import com.earlybird.entity.CnRole;

public interface ICnAdminAuthMenuPerm {
	
	public ArrayList<CnMenu> getMenuPermissionByUserName();
	
	public boolean updateMenuPermissionByUserName();
	
	public boolean deleteMenuPermissionByUserName();

	ArrayList<CnMenu> getMenuPermissionByUserName(String userName);
	
	public Map getCnAdminDetail(String userName);

}

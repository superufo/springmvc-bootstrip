package com.earlybird.security.shiro.auth;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class AdminAuthorityReamlm  extends AuthorizingRealm {

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		//token是用户输入的
        //第一步:丛token中取出身份信息
        String userName= (String) token.getPrincipal();

        //第二步:根据用户输入的userCode丛数据库查询


        //模拟丛数据库查询到的密码
        String password="111111";

      

        //如果查不到返回null，

        //如果查询到，返回认证信息AuthenticationInfo

        ///将activeUser设置到simpleAuthenticationInfo
        SimpleAuthenticationInfo simpleAuthenticationInfo=new
                SimpleAuthenticationInfo(userName,password,this.getName());


        return simpleAuthenticationInfo;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.web.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.web.struts.form.LoginForm;

/** 
 * MyEclipse Struts
 * Creation date: 10-29-2015
 * 
 * XDoclet definition:
 * @struts.action path="/login" name="loginForm" input="/jsp/login.jsp" scope="request" validate="true"
 */
public class LoginAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
	     LoginForm loginForm = (LoginForm) form;
	      // 获取账号信息
	     ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("applicationContext.xml");
	        System.out.println(beans);
	     //获取帐号密码
	        String username = loginForm.getUsername();
	        String password = loginForm.getPassword();
	        //帐号密码匹配,跳转到登录成功页
	        if("zjk".equals(username) && "123456".equals(password)){
	            return mapping.findForward("loginSuccess");
	        }
	        //不匹配,跳转到登录失败页
	        return mapping.findForward("loginFail");
	    }
}
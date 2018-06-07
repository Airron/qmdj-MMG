package com.qmdj.mmg.service.impl;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qmdj.mmg.service.UserService;
import com.qmdj.mmg.vo.User;


@Service
public class UserServiceImple implements UserService {

	/*
	 *     
	private String usercode;

    private String ipcode;

    private String username;

    private Byte userstate;

    private String userdepartment;

    private String job;

    private String outcode;

    private String param1;

    private String param2;

    private String param3;

    private String param4;
	*/
	
	public List<User> getUserByALL(User user,String ...args) {
		// TODO Auto-generated method stub
		String sqlStations = null;
		
		
		
		
		
		for(String s:args){
			sqlStations = s+sqlStations;
			Class<User> userClass = User.class;
			try {
				Method userMehtod = userClass.getMethod("get"+s,String.class);
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		return null;
	}

}

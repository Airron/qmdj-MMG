package com.qmdj.mmg.service;

import java.util.List;

import com.qmdj.mmg.vo.User;

public interface UserService {

	List<User> getUserByALL(User user,String ...args);

}

package com.zcc.code.service;

import java.util.List;

import com.zcc.code.entity.User;

/**
 * @author zhaocc
 * @time Jul 9, 2018 9:47:34 AM
 * @parent
 */
public interface UserService {

	public User selectUserById(Integer userId);

	public List<User> getAllUserList();

	public Integer addOneUser(User user);
}

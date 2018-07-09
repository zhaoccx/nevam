package com.zcc.code.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcc.code.dao.UserDao;
import com.zcc.code.entity.User;

/**
 * @author zhaocc
 * @time Jul 9, 2018 9:49:39 AM
 * @parent
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}

	public List<User> getAllUserList() {
		List<User> list = userDao.getAllUserList();
		return list;
	}

	public Map<String, List<User>> getAllUserListMap() {
		List<User> list = userDao.getAllUserList();
		Map<String, List<User>> map = new HashMap<String, List<User>>();
		map.put("users", list);
		return map;
	}

	public Integer addOneUser(User user) {
		return userDao.addOneUser(user);
	}

}

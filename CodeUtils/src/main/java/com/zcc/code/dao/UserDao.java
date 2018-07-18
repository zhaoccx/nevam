package com.zcc.code.dao;

import java.util.List;

import com.zcc.code.entity.User;

/**
 * @author zhaocc
 * @time Jul 9, 2018 9:44:12 AM
 * @parent
 */
public interface UserDao {

	/**
	 * 
	 * @param userId
	 * @return
	 */
	public User selectUserById(Integer userId);

	public List<User> getAllUserList();

	/**
	 * 添加user
	 * 
	 * @param user
	 *            学生实例
	 * @return 成功操作的主键
	 */
	public Integer addOneUser(User user);

	public Integer addOneUser(User user, User user2);

	public User addOneUser(User user, User user2, User user3);

	public User addOneUser(User user, User user2, User user3, User user4);

}
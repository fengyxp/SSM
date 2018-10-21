package cn.temptation.dao;

import cn.temptation.domain.LoginUser;

public interface LoginUserMapper {
	LoginUser findByUserName(String userName);
	boolean save(LoginUser user);
	boolean delete(int userId);
}

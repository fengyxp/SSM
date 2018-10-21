package cn.temptation.service;

import cn.temptation.domain.LoginUser;

public interface LoginUserService {
	LoginUser findByUserName(String userName);
	boolean save(LoginUser user);
	boolean delete(int userId);
}

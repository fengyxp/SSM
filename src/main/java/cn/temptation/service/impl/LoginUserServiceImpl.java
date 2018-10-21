package cn.temptation.service.impl;

import java.util.List;  

import javax.annotation.Resource;

import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
  
import cn.temptation.dao.LoginUserMapper;
import cn.temptation.domain.LoginUser; 
import cn.temptation.service.LoginUserService;

@Service  
@Transactional 
public class LoginUserServiceImpl implements LoginUserService {
	
	@Resource
	private LoginUserMapper mapper;
	
	public LoginUser findByUserName(String userName) {
		LoginUser user = mapper.findByUserName(userName);
		return user;
	}
	public boolean save(LoginUser user) {
		return mapper.save(user);
	}
	public boolean delete(int userId) {
		return mapper.delete(userId);
		
	}
}

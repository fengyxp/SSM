package cn.temptation.dao;

import cn.temptation.domain.User;
import java.util.List;

public interface UserDao {
	void save(User user);    
    boolean update(User user);    
    boolean delete(int id);    
    User findById(int id);    
    List<User> findAll(); 
}
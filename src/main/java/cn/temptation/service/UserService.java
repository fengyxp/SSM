package cn.temptation.service;
import java.util.List;  
  
import cn.temptation.domain.User;  
  
public interface UserService {  
	void save(User user);  
    boolean update(User user);  
    boolean delete(int id);  
    User findById(int id);  
    List<User> findAll(); 
}
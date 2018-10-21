package cn.temptation.service.impl;

import java.util.List;  

import javax.annotation.Resource;

import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
  
import cn.temptation.dao.UserDao;  
import cn.temptation.domain.User;  
import cn.temptation.service.UserService;  
 
@Service  
@Transactional  
// 此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。  
public class UserServiceImpl implements UserService {  
 
	@Resource  
    private UserDao mapper;  
  
    /**  
     * 根据  id  删除 数据  
     */  
    public boolean delete(int id) {  
        return mapper.delete(id);  
    }  
    /**  
     * 查询User的全部数据  
     */  
    public List<User> findAll() {  
        List<User> findAllList = mapper.findAll();  
        return findAllList;  
    }  
    /**  
     * 根据 id 查询 对应数据  
     */  
    public User findById(int id) {  
        User user = mapper.findById(id);  
        return user;  
    }  
    /**  
     * 新增数据  
     */  
    public void save(User user) {  
        mapper.save(user);  
    }  
    /**  
     * 根据 id 修改对应数据  
     */  
    public boolean update(User user) {  
        return mapper.update(user);  
    }  
}
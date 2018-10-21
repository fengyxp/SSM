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
// �˴����ٽ��д���SqlSession���ύ���񣬶��ѽ���springȥ�����ˡ�  
public class UserServiceImpl implements UserService {  
 
	@Resource  
    private UserDao mapper;  
  
    /**  
     * ����  id  ɾ�� ����  
     */  
    public boolean delete(int id) {  
        return mapper.delete(id);  
    }  
    /**  
     * ��ѯUser��ȫ������  
     */  
    public List<User> findAll() {  
        List<User> findAllList = mapper.findAll();  
        return findAllList;  
    }  
    /**  
     * ���� id ��ѯ ��Ӧ����  
     */  
    public User findById(int id) {  
        User user = mapper.findById(id);  
        return user;  
    }  
    /**  
     * ��������  
     */  
    public void save(User user) {  
        mapper.save(user);  
    }  
    /**  
     * ���� id �޸Ķ�Ӧ����  
     */  
    public boolean update(User user) {  
        return mapper.update(user);  
    }  
}
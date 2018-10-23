package cn.temptation.domain;

/**
 * 用户信息
 */
//<!-- user_id id,user_name userName,user_age age-->
//CREATE TABLE `t_user` (
//		  `user_id` int(11) NOT NULL AUTO_INCREMENT,
//		  `user_name` varchar(8) DEFAULT NULL,
//		  `user_age` varchar(8) DEFAULT NULL,
//		  PRIMARY KEY (`user_id`)
//		);
public class User {    
    
    private int id;    
    private String userName;   
    private String age;    
      
    @Override  
    public String toString() {  
        return "User [id=" + id + ", age=" + age + ", userName=" + userName  
                + "]";  
    }  
    public User(){    
        super();    
    }    
    public int getId() {    
        return id;    
    }    
    public void setId(int id) {    
        this.id = id;    
    }    
    public String getAge() {    
        return age;    
    }    
    public void setAge(String age) {    
        this.age = age;    
    }    
    public String getUserName() {    
        return userName;    
    }    
    public void setUserName(String userName) {    
        this.userName = userName;    
    }    
    public User(int id, String age, String userName) {    
        super();    
        this.id = id;    
        this.age = age;    
        this.userName = userName;    
    }    
}    
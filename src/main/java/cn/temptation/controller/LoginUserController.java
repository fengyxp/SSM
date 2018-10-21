package cn.temptation.controller;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.temptation.domain.LoginUser;
import cn.temptation.domain.User;
import cn.temptation.service.LoginUserService;  

@Controller  
@RequestMapping("/loginUser") 
public class LoginUserController {
	
	@Autowired
	private LoginUserService loginUserService;

	/**  
     * 获取所有用户列表  
     * @param request  
     * @return  
     */  
    @RequestMapping("/login")  
    public String login(LoginUser nowUser, Model model) {
    	System.out.print(nowUser.getPassword() + nowUser.getUserName());
    	LoginUser user = loginUserService.findByUserName(nowUser.getUserName());
    	
    	model.addAttribute("user", user);
    	if ( user == null){
    		return "redirect:/login.jsp"; 
//    		"redirect:/loginUser/login"
    	} else if (user.getPassword().equals(nowUser.getPassword())) {
    		return "/index";
    	} else {
    		return  "redirect:/login.jsp"; 
    	}
    }
//    public String getAllUser(HttpServletRequest request,Model model){  
//        List<User> user = userService.findAll();  
//        model.addAttribute("userList", user);  
////        request.setAttribute("userList", user);  
//        return "/allUser";  
//    } 
}

package springmvc.web.annotation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/data")
public class DataController {
	
	@RequestMapping("/addUser")
	public String addUser(String userName, String age, HttpServletRequest request){
		request.setAttribute("userName", userName);
		request.setAttribute("age", age);
		return "addUser";
	}
	
	@RequestMapping("/delUser")
	public String delUser(){
		String result = "I will del user. - �Ż�";
		return "annotation1";
	}
}

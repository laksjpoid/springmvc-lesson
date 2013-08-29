package springmvc.web.annotation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user2")
public class User2Controller {
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request){
		String result = "I will add user. - 优化";
		request.setAttribute("result", result);
		return "annotation1";
	}
	
	@RequestMapping("/delUser")
	public ModelAndView delUser(){
		String result = "I will del user. - 优化";
		return new ModelAndView("annotation1", "result", result);
	}
}

package springmvc.web.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/user/addUser", method=RequestMethod.GET)
	public ModelAndView addUser(){
		String result = "I will add user.";
		return new ModelAndView("annotation", "result", result);
	}
	
	@RequestMapping(value="/user/delUser", method=RequestMethod.GET)
	public ModelAndView delUser(){
		String result = "I will del user.";
		return new ModelAndView("annotation", "result", result);
	}
}

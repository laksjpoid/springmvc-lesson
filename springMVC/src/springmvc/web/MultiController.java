package springmvc.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MultiController extends MultiActionController{
	protected final Log logger = LogFactory.getLog(getClass());

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
		logger.info("MultiController.add()");
		return new ModelAndView("multi", "method", "add");
	}
	
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response){
		logger.info("MultiController.update()");
		return new ModelAndView("multi", "method", "update");
	}
}

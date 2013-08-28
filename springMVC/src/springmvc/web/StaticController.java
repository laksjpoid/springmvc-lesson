package springmvc.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class StaticController extends MultiActionController{
	protected final Log logger = LogFactory.getLog(getClass());

	public ModelAndView img(HttpServletRequest request, HttpServletResponse response){
		logger.info("StaticController.img()");
		return new ModelAndView("staticFile");
	}
}

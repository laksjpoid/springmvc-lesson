package springmvc.web;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HelloController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		logger.info("Returning hello view");
		
		String hello = "hello, ���Σ�";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("A", "��");
		map.put("B", "��");
		map.put("C", "��С����");
		return new ModelAndView("welcome", "map", map);
	}
}
package pureblog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	@RequestMapping("/")
	public ModelAndView getLoginPage(){
		return new ModelAndView("login");
	}
}

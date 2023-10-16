package fit.iuh;

import java.util.Locale;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String home(Locale locale, Model model ) {
		return "home";
	}
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public String loginPage(Locale locale, Model model) {
		return "login";
	}
	@RequestMapping(value= "/home", method = RequestMethod.POST)
	public String login(@Validated User user, Model model) {
		model.addAllAttributes("userName",user.get)
		return "user";
	}
	
}

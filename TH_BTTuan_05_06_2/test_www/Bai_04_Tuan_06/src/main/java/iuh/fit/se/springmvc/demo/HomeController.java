package iuh.fit.se.springmvc.demo;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class HomeController {
	public String showMyPage() {
		return "main-menu";
	}
}

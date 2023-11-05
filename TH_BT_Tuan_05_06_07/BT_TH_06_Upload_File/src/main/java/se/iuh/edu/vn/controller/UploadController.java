package se.iuh.edu.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	private static final String UPLOAD_DIRECTORY = "/images";
	
	@RequestMapping
	public ModelAndView uploadForm() {
		return new ModelAndView("uploadform");
	}
	
	public ModelAndView saveimage() {
		
		return new ModelAndView("uploadform", "filesuccess", "File successfully saved!");
	}
}

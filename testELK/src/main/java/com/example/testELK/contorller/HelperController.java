package com.example.testELK.contorller;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelperController {
	
	private static final Logger log=Logger.getLogger(HelperController.class.getName());
	
	@RequestMapping("/test")
	public String testmethod() {
		log.info("i am a test string");
		String res="i am coming from spring boot project";
		log.log(Level.INFO, res);
		return res;
	}

}

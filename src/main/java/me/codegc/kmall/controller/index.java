package me.codegc.kmall.controller;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class index {
	
	private static final Logger logger = LogManager.getLogger(index.class);

	@RequestMapping(method = RequestMethod.GET, value = { "/", "index.html" })
 	public String indexView() {
		logger.info("idnex.html");
		return "index";
	}
	
	@GetMapping("/test")
	@ResponseBody
	public String time() {
		return new Date().toLocaleString().toString();
	}
}

package com.htmlreturn.frameworklesson.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HtmlController {
	
	
	@GetMapping(value="/welcome", produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String WelcomeAsHTML() {
		
		return "<html>\n" + "<header><title>Welcome</title></header>\n"+
		"<body>\n" + "Hello World\n" + "</body>\n" + "</html>";
		
	}
	

}

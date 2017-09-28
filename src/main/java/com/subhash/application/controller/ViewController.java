package com.subhash.application.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.subhash.application.model.TopicBean;

@Controller
public class ViewController {
	
    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return "next";
    }
    
    @RequestMapping(value = "/ggettopics.xml",method = RequestMethod.GET,produces = "application/xml")
	public @ResponseBody TopicBean getAllTopic()
	{
		return new TopicBean("java", "subhash", "java developer");
		
	}
	
	

}

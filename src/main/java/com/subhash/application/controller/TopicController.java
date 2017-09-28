package com.subhash.application.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.subhash.application.model.TopicBean;

@RestController
public class TopicController {
	List<TopicBean> topics = null;
	
	@Autowired
	public TopicController()
	{
		topics = new ArrayList<>(Arrays.asList(new TopicBean("java", "subhash", "java developer"),
				new TopicBean("j2EE", "subhash", "java developer")));
	}

	@RequestMapping("/gettopics")
	public List<TopicBean> getAllTopic() {
		
		return topics;

	}

	@RequestMapping(value = "/ggettopics", method = RequestMethod.GET, produces = "application/xml")
	public TopicBean getAllTopicc() {
		return new TopicBean("java", "subhash", "java developer");
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addtopics")
	public void addTopic(@RequestBody TopicBean topic)
	{
		topics.add(topic);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topics.removeIf(t->t.getId().equals(id));
	}

}
